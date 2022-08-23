package wan.data.Sort;

import static wan.data.Sort.ApplySort.*;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr={16,24,12,23,2,78,27};
        insertSort(arr);
        printArr(arr);
    }
    public  static int[] insertSort(int[] arr){
        checkEmpty(arr);
        int a=0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j - 1);
                    a++;
                }
            }

        }
        System.out.println(a);
        return arr;
    }
}
