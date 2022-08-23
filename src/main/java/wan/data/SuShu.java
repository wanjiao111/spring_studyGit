package wan.data;

import java.util.Objects;

public class SuShu {
    public static void main(String[] args) {
//        printArr(suShu(100, 200));
//        printArr(shuixianhua(100, 200));
//        printGrade(90);
//        printDivisorMultiple(5, 10);
//        typeCount("shkjn,mnihuiguigwe   kljsk") ;
//        xiangJia(3,3);
//        System.out.println();
//        wanShu(100);
//        qiu(3);
//        jiuJiu();
//        taoZi(3);
//        jiOUXuLie(10);




    }

    public static int[] suShu(int a, int b) {
        A a1 = new A();
        int[] ins = new int[b - a];
        int count = 0;
        int index = 0;
        for (int i = a; i < b; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ins[index++] = i;
                count++;
            }
        }
        int[] ints = new int[count];
        for (int i = 0; i < count; i++) {
            ints[i] = ins[i];

        }
        a1.setSuShu(ints);
        return a1.getSuShu();
    }

    public static int[] shuixianhua(int a1, int b1) {
        A a2 = new A();
        int index = 0;
        int[] ins = new int[b1 - a1];
        for (int i = a1; i < b1; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 10;
            if (a * a * a + b * b * b + c * c * c == i) ins[index++] = i;
        }
        int[] ints = new int[index];
        for (int i = 0; i < index; i++) {
            ints[i] = ins[i];
        }
        a2.setShuXianHua(ints);
        return a2.getShuXianHua();
    }

    public static void printGrade(int a) {
        char grade = a >= 90 ? 'A' : a >= 60 ? 'B' : 'C';
        System.out.println(grade);
    }

    public static void printDivisorMultiple(int a, int b) {
        int min = (a < b ? a : b);
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("最大公约数为：" + i);
                System.out.println("最小公倍数为：" + a * b / i);
                break;
            }

        }
    }

    //题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
    public static void typeCount(String a) {
        int abcCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                abcCount++;
            } else if (Character.isDigit(chars[i])) {
                numCount++;
            } else if (Character.isSpaceChar(chars[i])) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("字母：" + abcCount + "数字：" + numCount + "空格:" + spaceCount + "其他:" + otherCount);
    }

    //题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
    public static void xiangJia(int a, int x) {
        int s = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                s += a * Math.pow(10, j);
            }
        }

        System.out.println("和为：" + s);
    }

    //    题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程     找出1000以内的所有完数。
    public static void wanShu(int a) {
        for (int i = 1; i <= a; i++) {
            int t = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    t += j;
            }
            if (t == i)
                System.out.println(t + "\t");
        }
    }

    //    题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
    public static void qiu(int a) {
//        double tan = 0;
//        double sum = 100;
//        for (int i = 0; i < a; i++) {
//            sum+=tan*2;
//            tan = 100 / (Math.pow(2, i + 1));
//        }
//        System.out.println("第"+a+"次弹："+tan);
//        System.out.println("第"+a+"次共走了：："+sum);
        double h = 100;
        double s = 100;
        for (int i = 1; i <= a; i++) {
            h = h / 2;
            s = s + 2 * h;
        }
        System.out.println("第" + a + "次弹：" + h);
        System.out.println("第" + a + "次共走了：" + s);
    }

    //    题目：有1、2、3、4四个数字，能组成多少个互不相同且一个数字中无重复数字的三位数？并把他们都输入。
    public static void jiuJiu() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    //    题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个     第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下     的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
    public static void taoZi(int a) {
        int x = 1;
        int sum = 0;
        for (int i = 1; i < a; i++) {
            sum += (x + 1) * 2;
        }
        System.out.println(sum);
    }

    //    题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
    public static void trueFalse() {

    }

    //打印奇偶序列
    public static void   jiOUXuLie(int num){
        for(int i=31;i>=0;i-=2){
            System.out.print(((num>>i)&1)+" ");
        }
        System.out.println();//换行打印

        // 取到二进制序列中的奇数位

        for(int i=30;i>=0;i-=2){
            System.out.print(((num>>i)&1)+" ");
        }

    }


    public static class A {
        private int[] suShu;
        private int[] shuiXianHua;

        public void setSuShu(int[] suShu) {
            this.suShu = suShu;
        }

        public int[] getSuShu() {
            return suShu;
        }

        public void setShuXianHua(int[] shuiXianHua) {
            this.shuiXianHua = shuiXianHua;

        }

        public int[] getShuXianHua() {
            return shuiXianHua;

        }
    }

}

