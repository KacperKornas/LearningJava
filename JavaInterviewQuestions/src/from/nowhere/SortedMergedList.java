package from.nowhere;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedMergedList {
    public static void main(String[] args) {
        mergeAndSort merger = new mergeAndSort();
        merger.merge(merger.a);
        merger.merge(merger.b);
        merger.merge(merger.c);

        for (int i : merger.mergedList) System.out.print(i + " ");
        System.out.println();

        Collections.sort(merger.mergedList);

        for (int i : merger.mergedList) System.out.print(i + " ");
    }
}

class mergeAndSort {
    int[] a = {1, 2, 3};
    int[] b = {22, 33, 44};
    int[] c = {2, 25, 32};
    List<Integer> mergedList = new ArrayList<>();

    void merge(int[] list) {
         for (int i = 0; i < list.length; i++) {
             mergedList.add(list[i]);
         }
    }
}
