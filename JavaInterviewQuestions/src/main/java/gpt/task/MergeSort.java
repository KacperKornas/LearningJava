package gpt.task;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] l = {5,2,9,1,5,6};
        m.show(l);
        m.mSort(l);
        m.show(l);
    }

    void mSort(int[] list) {
        if (list.length < 2) return;

        int middle = list.length / 2;

        int[] left = new int[middle];
        int[] right = new int[list.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = list[i];
        }

        for (int i = middle; i < list.length; i++) {
            right[i - middle] = list[i];
        }

        mSort(left);
        mSort(right);

        merge(list, left, right);
    }

    void merge(int[] list, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length ) {
            if (left[i] <= right[j]) {
                list[k++] = left[i++];
            } else {
                list[k++] = right[j++];
            }
        }

        while (i < left.length) {
            list[k++] = left[i++];
        }

        while (j < right.length) {
            list[k++] = right[j++];
        }
    }

    void show(int[] a) {
        for (int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
