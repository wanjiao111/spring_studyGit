package com.wan.data;

public class TriPrint {
    public static void main(String[] args) throws InterruptedException {
//        printzhengRight(3,"s");
//        printDaoRight(3,"z");
//        printDaoLeft(18, "b");
//        printZhengLeft(5,"a");
        printTrigle(4, "s");
        printHeart();
    }

    public static void printZhengLeft(int a, String a1) {
        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(a1);
            }
            System.out.println();
        }
    }

    public static void printDaoRight(int b, String b1) {
        for (int i = 1; i <= b; i++) {
            for (int j = b; j >= i; j--) {
                System.out.print(b1);
            }
            System.out.println();
        }
    }


    public static void printzhengRight(int d, String d1) {
        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(d1);
            }
            System.out.println();
        }
    }

    public static void printDaoLeft(int c, String c1) {
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = c; j >= i; j--) {
                System.out.print(c1);
            }
            System.out.println();
        }
    }

    public static void printTrigle(int e, String e1) {
        for (int i = 1; i <= e; i++) {
            for (int j = e; j >= i; j--) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(e1);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(e1);
            }
            System.out.println();
        }
    }

    public static void printHeart() throws InterruptedException {
        for (double i = 1.5; i > -1.5; i -= 0.09) {
            for (double j = -2; j < 2; j += 0.025) {
                double a = i * i + j * j - 1;
                if ((a * a * a - i * i * i * j * j) <= 0.0) {
                    Thread.sleep(0);
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}