package ru.job4j;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static ru.job4j.JavaMergeSort.merge;
import static ru.job4j.JavaMergeSort.mergeSort;

public class javaMergeSortTest {

    @Test
    public void merge_sortTest() {
        int[] d = new int[]{1,54,6,3232,7676,5445,78,22,11,44,};
        int[] result = mergeSort(d);
        int[] excepted = new int[]{1, 6, 11, 22, 44, 54, 78, 3232, 5445, 7676};
        assertThat(result, is(excepted));
    }

    @Test
    public void mergeTest() {
        int[] a = new int[] {2,2,4,8,546};
        int[] b = new int[] {3,5,7,9};
        int[] result = merge(a, b);
        int[] excepted = new int[]{2, 2, 3, 4, 5, 7, 8, 9, 546};
        assertThat(result, is(excepted));
    }
}