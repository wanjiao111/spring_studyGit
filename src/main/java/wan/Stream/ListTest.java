package wan.Stream;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;

public class ListTest {
    public static void main(String[] args) {
        test();

    }
    public static void test(){
        HashMap<String, Object> map = new HashMap<>();
        Person2 person1 = new Person2("wangsan",11000,15,"female","Ohio");
        Person2 person2= new Person2("wangsan",11000,15,"female","California");
        Person2 person3= new Person2("wangsan",11000,15,"female","\n" +
                "Pennsylvania");
        Person2 person4 = new Person2("wangsan",11000,15,"female","Florida");
        map.put("stu1",person1);
        map.put("stu2",person2);
        map.put("stu3",person3);
        map.put("stu0",person4);
        System.out.println(map);
//        map.get()


    }


}
@Data
@Builder
class Person2 {
    private String name;  // 姓名
    private int salary; // 薪资
    private int age; // 年龄
    private String sex; //性别
    private String area;  // 地区
}


