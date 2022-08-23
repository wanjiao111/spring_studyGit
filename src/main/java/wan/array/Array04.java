package wan.array;

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        int[] myList = {5, 2, 3, 4};
        int i = Arrays.binarySearch(myList, 3);//二分法查找
        Arrays.sort(myList);//排序
        System.out.println(i);
        System.out.println(Arrays.toString(myList));//将数组转成字符串
        Arrays.fill(myList,1,3,0);//将对应的数组全部填充为某个值
        System.out.println(Arrays.toString(myList));
    }


}
