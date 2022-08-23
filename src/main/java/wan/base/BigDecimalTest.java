package wan.base;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal a= BigDecimal.valueOf(-56);
        BigDecimal b= BigDecimal.valueOf(50);
        System.out.println(a.signum()==-1);
    }

}
