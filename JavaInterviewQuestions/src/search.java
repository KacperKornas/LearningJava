public class search {

    public static void main (String[] args) {

        int[] arr = {3,35,36,69,80,90};
        int target = 3;

        int result = Search(arr, target, 0, arr.length-1);

        if (result == -1) {
            System.out.println("Element don't finded.");
        } else {
            System.out.println("Element is on the index " + result + "!");
        }
    }

    private static int Search (int[] arr, int target, int low, int high) {
        int mid = (low + high) / 2;

        if (low > high) {
            return -1;
        } else if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return Search(arr,target,low,mid-1);
        } else {
            return Search(arr,target,mid+1,high);
        }
    }
}
