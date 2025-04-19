package internet;// Write a program that prints every other element of your array.
// The first array contains even values and the second array contains odd values.

public class SecondArrayValue {
    public static void main(String[] args) {

        int[] odd = new int[50];
        int[] even = new int[50];

        for (int i=0, value = 1; i < 50; i++, value += 2) {
            odd[i] = value;
        }

        for (int i=0, value = 2; i < 50; i ++, value += 2) {
            even[i] = value;
        }

        for (int i = 0; i < odd.length; i += 2) {
            System.out.print(odd[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < even.length; i += 2) {
            System.out.print(even[i] + " ");
        }
    }
}

