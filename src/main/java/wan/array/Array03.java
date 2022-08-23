package wan.array;

public class Array03 {
    public static void main(String[] args) {
        //1.创建一个二维数组  0：无子 1：白子  2：黑子
        int[][] i=new int[11][11];
        i[2][3]=1;
        i[3][4]=2;
        //遍历输出二维数组
        for (int[] ints : i) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }


    }
}
