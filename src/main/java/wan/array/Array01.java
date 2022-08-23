package wan.array;

public class Array01 {
    public static void main(String[] args) {
        int[] nums;//1.声明一个数组
        nums = new int[10];//2.创建一个数组,给数组开辟空间
        //给数组中元素赋值
        nums[0] = 2;
        nums[1] = 2;
        nums[2] = 2;
        nums[3] = 2;
        nums[4] = 2;
        nums[5] = 2;
        nums[6] = 2;
        nums[7] = 2;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

}
