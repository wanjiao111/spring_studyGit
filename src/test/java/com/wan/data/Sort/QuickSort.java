package com.wan.data.Sort;

import static com.wan.data.Sort.ApplySort.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={16,24,12,23,2,78,27};
        quickSort(arr,0,6);
        printArr(arr);
        System.out.println("nihao");
    }
    public static void quickSort(int[] arr,int low,int high){
        checkEmpty(arr);
        while(low>high)
            return;
        int i,j,line,temp;
        line=arr[low];
        i=low;
        j=high;
        while(i<j){
            while(arr[j]>=line&&i<j)
                j--;
            while (arr[i]<=line&&i<j)
                i++;
            if(i<j) {
               swap(arr,i,j);

            }

        }
        swap(arr,low,i);
        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
    }


}
