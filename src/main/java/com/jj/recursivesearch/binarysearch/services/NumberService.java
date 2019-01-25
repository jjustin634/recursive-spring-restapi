package com.jj.recursivesearch.binarysearch.services;

public class NumberService {

    public static void bubbleSort(int[] arr) {
        for (int i : arr) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
