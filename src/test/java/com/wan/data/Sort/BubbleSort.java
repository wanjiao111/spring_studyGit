package com.wan.data.Sort;

import static com.wan.data.Sort.ApplySort.*;

public class BubbleSort {
    public static void main(String[] args) {
//        ApplySort applySort = new ApplySort();
        int[] arr={16,24,12,23,2,78,27};
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);

    }
    public static  void  bubbleSort(int[] arr){
        checkEmpty(arr);
        int a=0;
        for (int i = 0; i < arr.length-1 ; i++) {
            boolean flag=true;
            for (int j = arr.length-1; j >i ; j--) {
                if (arr[j-1]>arr[j]) {
                    swap(arr, j, j - 1);
                    flag = false;
                }
                a++;
            }

            if(flag)
                break;
        }
        System.out.println(a+"次");

    }
    public static  void bubbleSort1(int[] arr){
        checkEmpty(arr);
        int a=0;
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
            a++;
            }
        }
        System.out.println(a);
    }



}
