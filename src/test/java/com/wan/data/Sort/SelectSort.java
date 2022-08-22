package com.wan.data.Sort;

import static com.wan.data.Sort.ApplySort.*;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr={16,24,12,23,33,55,27};
        printArr(arr);
        selectSort(arr);
        printArr(arr);
    }
    public static  void   selectSort(int[] arr){
        checkEmpty(arr);
        int a=0;
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex=i;

            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex=j;
                    a++;
                }

            }
            if(minIndex!=i)
                swap(arr,i,minIndex);
        }
        System.out.println(a);
    }
}
