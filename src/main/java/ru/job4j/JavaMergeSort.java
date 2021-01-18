package ru.job4j;

public class JavaMergeSort {
    public static int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < res.length;  i++) {
            if (indexA > a.length - 1) {
                res[i] = b[indexB];
                indexB++;
            } else if (indexB > b.length - 1) {
                res[i] = a[indexA];
                indexA++;
            } else if (a[indexA] < b[indexB]) {
                res[i] = a[indexA];
                indexA++;
            } else {
                res[i] = b[indexB];
                indexB++;
            }
        }
        return res;
    }

    public static int[] mergeSort(int[] a) {

        if (a.length < 2) {
            return a;
        }
        int[] b = new int[a.length / 2];
        int[] c = new int[a.length - a.length / 2];
        for (int i = 0; i < a.length / 2; i++) {
            b[i] = a[i];
        }
        for (int i = a.length / 2; i < a.length; i++) {
            c[i - a.length / 2] = a[i];
        }
        b = mergeSort(b);
        c = mergeSort(c);
        return merge(c, b);

    }
}
