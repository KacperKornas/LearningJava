package from.nowhere;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {2,5,14,16,30,46,60,70,83,92};
        int target = 14;

        int result = binarySearchRecursive(arr, target, 0, arr.length-1);
        if (result == -1) {
            System.out.println("Element not found in the array. :c");
        } else {
            System.out.println("You find it! It is at index " + result + "!");
        }

    }

    private static int binarySearchRecursive(int[] arr, int target, int low, int high) {

        int middle =  (low + high) / 2;

        if (low > high) {
            return  -1;
        } else if (arr[middle] == target) {
            return middle;
        } else if (arr[middle] > target) {
            return binarySearchRecursive(arr,target,low, middle -1);
        } else {
            return binarySearchRecursive(arr, target, middle + 1, high);
        }
    }
}
