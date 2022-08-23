package wan.LocalDateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomTimeBizNo {
    public static void main(String[] args) {
        System.out.println(getRandomFileName(String.valueOf(123)));
        String a = "aaa";
        String b = "bbb";
        int c = 111;
        System.out.println(a + b + c);
        System.out.println(new Date());
    }

    public static String getRandomFileName(String shopCode) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        Random random = new Random();
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
        return str + shopCode + rannum;// 当前时间  }
    }
}

