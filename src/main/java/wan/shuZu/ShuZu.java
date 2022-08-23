package wan.shuZu;

public class ShuZu {
    public static void main(String[] args) {
//        ShuZu shuZu = new ShuZu();
//        shuZu.test(4,2,3,5,4,2);
//        test(0, 2, 3);
        String s = fillString(56+1, 5);
        System.out.println(s);
    }

    //可变参数 int...i 放参数最后面
    public static void test(int x, int... i) {
        System.out.println(i[0]);
        System.out.println(i[1]);
//        System.out.println(i[2]);
//        System.out.println(i[3]);
//        System.out.println(i[4]);
    }
    public static String fillString(int num , int digit) {
/*
0：表示前面补0
digit：表示保留数字位数
d：表示参数为正数类型
*/
        return String.format("%0"+digit+"d", num);
    }
}
