package wan.Stream;

import org.checkerframework.checker.units.qual.C;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionTest {
    public static void main(String[] args) throws InterruptedException {
        String name = "";
        String name1 = "12345";
        System.out.println(validInput(name, a -> a.isEmpty() ? "名字不能为空" : a));
        System.out.println(validInput(name1, inputStr -> inputStr.length() > 3 ? "名字过长" : inputStr));
        validInputCo(name, inputStr ->
                System.out.println(inputStr.isEmpty() ? "名字不能为空" : "名字正常"));
        validInputCo(name1, inputStr ->
                System.out.println(inputStr.isEmpty() ? "名字不能为空" : "名字正常"));
        String name2 = "12345";
        System.out.println(validInputPr(name,inputStr ->  !inputStr.isEmpty() &&  inputStr.length() <= 3 ));
        System.out.println(validInputPr(name1,inputStr ->  !inputStr.isEmpty() &&  inputStr.length() <= 3 ));
        System.out.println(validInputPr(name2,inputStr ->  !inputStr.isEmpty() &&  inputStr.length() <= 3 ));

        //1. 使用匿名内部类
        System.out.println("匿名内部类返回：");
        Function<Integer, String> f = new Function<Integer,String>(){
            @Override
            public String apply(Integer t) {
                return null;
            }
        };
        System.out.println(f.apply(4));

//2. 使用 Lambda 表达式
        System.out.println("lambda表达式返回：");
        Function<Integer, String> f2 = t->String.valueOf(t);
        System.out.println(f2.apply(4));

//3. 使用方法引用的方式
        System.out.println("方法引用返回：");
        Function<Integer, String> f1 = String::valueOf;
        System.out.println(f1.apply(null));

//        System.out.println("输入一系列数字用function返回最大值（入参list<Interger>,出参Integer）:");
//        Function<List<Integer>,Integer>=t->t.


        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        System.out.println(list);


        OptionalInt max = list.stream().mapToInt(a -> a).max();
        System.out.println(max);
        Optional<Integer> reduce = list.stream().reduce(Integer::max);
        System.out.println(reduce);
        for(Integer a:list){
            System.out.println(a);
        }

        //设置一个大于7的过滤条件
        Predicate<Integer> predicate = x -> x > 7;
        Predicate<Integer> predicate2 = x -> x < 9;

        //输出 fasle  对predicate的条件取非
        System.out.println("对predicate的条件取非:"+predicate.negate().test(10));
        //输出 true  对predicate和predicate1的条件取或者
        System.out.println("判断对象是否相等："+Predicate.isEqual("wanda").test("wanda"));





    }


    public static String validInput(String name, Function<String, String> function) {
        return function.apply(name);
    }

    public static void validInputCo(String name, Consumer<String> function) {
        function.accept(name);
    }

    public static boolean validInputPr(String name, Predicate<String> function) {
        return function.test(name);
    }

}
