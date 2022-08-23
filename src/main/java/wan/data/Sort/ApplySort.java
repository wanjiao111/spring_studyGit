package wan.data.Sort;

public class ApplySort {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }
    public static void checkEmpty(int[] arr){
        if(arr==null||arr.length==0){
            return;
        }
    }
    public static void checkCondition(int a,int b){
        if(a>b)
            return;
    }
}
