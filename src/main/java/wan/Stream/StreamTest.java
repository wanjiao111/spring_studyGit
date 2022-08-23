package wan.Stream;

import com.alibaba.fastjson.JSONObject;
import com.github.javafaker.Faker;
import lombok.Builder;
import lombok.Data;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {

    public static Faker fakerInstance = Faker.instance(Locale.CHINA);

    public static void main(String[] args) {
//        List<Person1> personList = new ArrayList<Person1>();
//        List<Person2> personList1 = new ArrayList<Person2>();

//        System.out.println(generate(10000));
//        System.out.println(method1());
//        List<Person3> generate = generate(10000);
//        personTest();
//        method1(generate);
//        method2(generate);
//        method3(generate);
//        method4(generate);
//        method5(generate);
//        method6(generate);
//          method7(generate);
//        test1();
//        test2();
//        test3();
        person1Test();
//        classDemo();
    }

    public static void test3() {
        String[] strArr = {"ab", "abcd", "万"};
        List<String> strListNew = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("元素大写：" + strListNew);

    }
//    public static void classDemo(){
//        Consumer consumer = new c();
//        consumer.accept("kkkkk");
//        System.out.println(consumer);
//    }

    public static void test1() {
        List<String> list = new ArrayList<>();
        list.add("王二");
        list.add("张三");
        list.add("王二");
        list.add("李四");

//        list.stream().distinct().forEach(e-> System.out.println(e));
//        long len = list.stream().distinct().count();
//        System.out.println(len);
//        list.stream().distinct().forEach(e-> e.startsWith("李"));
//        list.stream().distinct().forEach(e-> System.out.println("元素"+e));
//        list.stream().distinct().filter(e->e.contains("李")).forEach(e-> System.out.println("元素过滤"+e));
//        System.out.println(list);
//        list.stream().forEach(System.out::println);


//        String[] arr=new String[]{"张三","李四","王五","赵六"};
//        Arrays.stream(arr).forEach(System.out::println);


        List<String> list1 = new ArrayList<>();
        list1.add("网易而");
        list1.add("工作细胞");
        list1.add("飘");
//        Stream<Integer> integerStream = list1.stream().map(String::length);
//        integerStream.forEach(System.out::println);
        Optional<String> max = list1.stream().max(Comparator.comparing(String::length));
        System.out.println("stringList1中最长的字符串：" + max.get());

//        List<String> list01=Arrays.asList("a","ab","abc");
//        System.out.println("list01:"+list01);
//        int[] arr={1,2,3};
//       Arrays.stream(arr).forEach(System.out::println);
//        IntStream stream = Arrays.stream(arr);


        List<Student> students = new ArrayList<>();
        Student student1 = new Student("川流风", 21);
        Student student2 = new Student("张三丰", 23);
        Student student3 = new Student("王祖贤", 20);
        Student student4 = new Student("张丹丹", 25);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
//        Stream<String> stringStream = students.stream().map(Student::getName);
//        stringStream.forEach(System.out::println);
        List<String> nameList = students.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(nameList);
        List<Student> studentsList = students.stream().filter(x -> x.getName().contains("张")).collect(Collectors.toList());
        studentsList.stream().forEach(System.out::println);
        System.out.println(studentsList);
//      studentsList.stream().forEach(System.out::println);


//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("张三");
//        list2.add("李四");
//        list2.add("王二麻子");
//        list2.add("张三他大爷");
//        String reduce = list2.stream().filter(e -> e.contains("张")).reduce("组合:", (a, b) -> a + b);
//        System.out.println(reduce);

    }


    public static void method6(List<Person3> generate) {
        Map<String, Integer> collect = generate.stream().collect(Collectors.toMap(new Function<Person3, String>() {

            @Override
            public String apply(Person3 person) {

                return person.getName();
            }
        }, new Function<Person3, Integer>() {
            @Override
            public Integer apply(Person3 person) {
                return 1;
            }
        }, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer o, Integer o2) {
                return o + 1;
            }
        }));

        System.out.println(JSONObject.toJSONString(collect));
    }


    public static void method6Copy(List<Person3> generate) {
        Map<String, Integer> collect = generate.stream().collect(Collectors.toMap(Person3::getName, person -> 1, (o, o2) -> o + 1));

        System.out.println(JSONObject.toJSONString(collect));
    }

    public static List<Person3> generate(int size) {

        return IntStream.range(0, size)
                .mapToObj(e -> {
                    Person3 person = new Person3();
                    person.setAge(fakerInstance.random().nextInt(10, 80));
                    person.setName(fakerInstance.name().fullName());
                    person.setHeight(fakerInstance.random().nextInt(150, 190));
                    person.setCity(fakerInstance.address().city());
                    return person;
                }).collect(Collectors.toList());

    }


    public static void method1(List<Person3> generate) {
        List<Person3> aaa = generate.stream().filter(new Predicate<Person3>() {
            @Override
            public boolean test(Person3 person) {
                return person.getName().startsWith("万");
            }
        }).collect(Collectors.toList());
        System.out.println(aaa);

    }

    public static void method2(List<Person3> generate) {
        List<Person3> bbb = generate.stream().filter(new Predicate<Person3>() {
            @Override
            public boolean test(Person3 person) {
                return person.getAge() > 40 && person.getAge() < 50;
            }
        }).collect(Collectors.toList());
        System.out.println(bbb);
    }

    public static void method3(List<Person3> person) {
        List<Person3> ccc = person.stream().sorted(new Comparator<Person3>() {
            @Override
            public int compare(Person3 o1, Person3 o2) {
                Integer height1 = o1.getHeight();
                Integer height2 = o2.getHeight();
                return height2 - height1;
            }
        }).collect(Collectors.toList());
        System.out.println(ccc);
    }

    public static void method4(List<Person3> person) {
        List<Person3> ddd = person.stream().sorted(new Comparator<Person3>() {
            @Override
            public int compare(Person3 o1, Person3 o2) {
                return o1.getAge() - o2.getAge();
            }
        }).collect(Collectors.toList());
        System.out.println(ddd);
    }

    public static void method5(List<Person3> person) {
        Map<String, List<Person3>> collect = person.stream().filter(new Predicate<Person3>() {
            @Override
            public boolean test(Person3 person) {
                return person.getAge() > 25 && person.getAge() < 30;
            }
        }).sorted(new Comparator<Person3>() {
            @Override
            public int compare(Person3 o1, Person3 o2) {
                return o1.getAge() - o2.getAge();
            }
        }.thenComparing(new Comparator<Person3>() {
            @Override
            public int compare(Person3 o1, Person3 o2) {
                return o1.getHeight() - o2.getHeight();
            }
        })).collect(Collectors.groupingBy(new Function<Person3, String>() {
            @Override
            public String apply(Person3 person) {
                return person.getCity();
            }
        }));
        System.out.println(JSONObject.toJSONString(collect));
    }

    public static void method7(List<Person3> person) {
        Map<Object, List<Person3>> ggg = person.stream().filter(new Predicate<Person3>() {
            @Override
            public boolean test(Person3 person) {
                return person.getAge() > 20 && person.getAge() < 30;
            }
        }).sorted(new Comparator<Person3>() {
            @Override
            public int compare(Person3 o1, Person3 o2) {
                return o1.getAge() - o2.getAge();
            }
        }.thenComparing(new Comparator<Person3>() {
            @Override
            public int compare(Person3 o1, Person3 o2) {
                return o1.getHeight() - o2.getHeight();
            }
        })).collect(Collectors.groupingBy(new Function<Person3, Object>() {
            @Override
            public Object apply(Person3 person) {
                return person.getName();
            }
        }));
        System.out.println(ggg);
    }


    public static void test2() {
        List<Integer> list = Arrays.asList(1, 3, 33, 55, 67, 35, 62, 5, 2);
        Optional<Integer> findFirst = list.stream().filter(x -> x > 6).findFirst();
        System.out.println(findFirst.get());
        Optional<Integer> findAny = list.stream().filter(x -> x > 6).findAny();
        System.out.println(findAny.get());
        boolean anyMatch = list.stream().anyMatch(x -> x > 6);
        System.out.println(anyMatch);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max.get());
        Optional<Integer> max1 = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(max1.get());
        List<Integer> intListNew = list.stream().map(x -> x + 3).collect(Collectors.toList());
        System.out.println("intList:" + list);
        System.out.println("每个元素加3的intList：" + intListNew);
        Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
        Optional<Integer> sum1 = list.stream().reduce(Integer::sum);
        Integer sum2 = list.stream().reduce(0, Integer::sum);
        Optional<Integer> product = list.stream().reduce((x, y) -> x * y);
        Optional<Integer> maxx = list.stream().reduce((x, y) -> x > y ? x : y);
        Integer maxx1 = list.stream().reduce(1, Integer::max);
        System.out.println("求和：" + "sum:" + sum.get() + "sum1:" + sum1.get() + "sum2:" + sum2);


    }
//    public static void personTest(){
////        List<Person2> personList1 = new ArrayList<>();
//        personList1.add(new Person2("aaa",8000,14,"male","china"));
//        personList1.add(new Person2("bbb",7000,17,"female","America"));
//        personList1.add(new Person2("ccc",7000,17,"female","uk"));
//        personList1.add(new Person2("ddd",9000,18,"male","europe"));
//        personList1.stream().filter(x->x.getSalary()>=7000).forEach(System.out::println);
//    }

    public static void person1Test() {
        List<Person2> personList = new ArrayList<Person2>();
        personList.add(new Person2("Tom", 8900, 11, "male", "New York"));
        personList.add(new Person2("Jack", 7000, 12, "male", "Washington"));
        personList.add(new Person2("Lily", 8200, 13, "female", "Washington"));
        personList.add(new Person2("Anni", 7800, 13, "female", "New York"));
        personList.add(new Person2("Owen", 9500, 24, "male", "New York"));
        personList.add(new Person2("Alisa", 7900, 23, "female", "New York"));
        System.out.println("findFirst:");
        Optional<Person2> firstFind = personList.stream().filter(x -> x.getSalary() > 8000).findFirst();
        System.out.println(firstFind.get());

        System.out.println("工资大于8000的人的名字");
        personList.stream().filter(x -> x.getSalary() > 8000).map(Person2::getName).forEach(System.out::println);

        System.out.println("高于8000的员工姓名的集合：");
        List<String> collect = personList.stream().filter(x -> x.getSalary() > 8000).map(Person2::getName).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("最高工资的员工：");
        Optional<Person2> max1 = personList.stream().max(Comparator.comparing(Person2::getSalary));
        System.out.println(max1.get());

        List<Person2> personListNewChange = personList.stream().map(person1 -> {
            person1.setSalary(person1.getSalary() + 1000);
            return person1;
        }).collect(Collectors.toList());
        System.out.println("personList:" + personList);
        System.out.println("工资加1000后的personListChange:" + personListNewChange);
        List<Person2> personListNew = personList.stream().map(person1 -> {
            Person2 personNew = new Person2(person1.getName(), 0, person1.getAge(), person1.getSex(), person1.getArea());
            personNew.setSalary(person1.getSalary() + 1000);
            return personNew;
        }).collect(Collectors.toList());
        System.out.println("改动前：" + personList);
        System.out.println("改动后：" + personListNew);


        Optional<Integer> maxSalary = personList.stream().map(Person2::getSalary).reduce(Integer::max);
        System.out.println("maxSalary:" + maxSalary.get());

        System.out.println("总信息");
        IntSummaryStatistics collect4 = personList.stream().collect(Collectors.summarizingInt(Person2::getSalary));
        System.out.println(collect4);

        Double averageSalary = personList.stream().collect(Collectors.averagingDouble(Person2::getSalary));
        System.out.println("averageSalary" + averageSalary);

        Optional<Integer> maxSalary1 = personList.stream().map(Person2::getSalary).collect(Collectors.maxBy(Integer::compare));
        System.out.println("maxSalary1:" + maxSalary1.get());


        DoubleSummaryStatistics statistics = personList.stream().collect(Collectors.summarizingDouble(Person2::getSalary));
        System.out.println("statistics:" + statistics);

        System.out.println("大于9000的工资然后按性别分组：");
        Map<String, List<Person2>> groupBySexMap = personList.stream().filter(x -> x.getSalary() > 9000).collect(Collectors.groupingBy(Person2::getSex));
        System.out.println("groupBySexMap:" + groupBySexMap);

        System.out.println("先按性别分组再按地区分组：");
        Map<String, Map<String, List<Person2>>> groupBySexArea = personList.stream().collect(Collectors.groupingBy(Person2::getSex, Collectors.groupingBy(Person2::getArea)));
        System.out.println("groupBySexArea" + groupBySexArea);

        System.out.println("Collectors,joining(),括号里面的连接元素");
        String join = personList.stream().map(x -> x.getName()).collect(Collectors.joining("----"));
        System.out.println("join:" + join);

        System.out.println("Collectors.reducing(),reducing归约求工资和再减5000：");
        Integer reducingSalary = personList.stream().collect(Collectors.reducing(2, Person2::getSalary, (x, y) -> (x + y - 5000)));
        System.out.println("reducingSalary:" + reducingSalary);


        List<Person2> orderByAge = personList.stream().sorted(Comparator.comparing(Person2::getAge)).collect(Collectors.toList());
        System.out.println("orderByAge:" + orderByAge);
        List<Person2> orderBySalary = personList.stream().sorted(Comparator.comparing(Person2::getSalary)).collect(Collectors.toList());
        System.out.println("orderBySalary:" + orderBySalary);
        List<Person2> orderByAgeSalary = personList.stream().sorted(Comparator.comparing(Person2::getAge).thenComparing(Person2::getSalary)).collect(Collectors.toList());
        System.out.println("orderByAgeSalary:" + orderByAgeSalary);

        System.out.println("统计元素数量：");
        long count = personList.stream().count();
        System.out.println(count);

        System.out.println("年龄sum总信息：");
        DoubleSummaryStatistics collect1 = personList.stream().collect(Collectors.summarizingDouble(Person2::getAge));
        System.out.println(collect1);

        List<Person2> collect2 = personList.stream().map(person1 -> {
            person1.setSalary(person1.getSalary() + 10000);
            return person1;
        }).collect(Collectors.toList());
        System.out.println(collect2);


        collect2.stream().filter(x -> x.getAge() < 20).forEach(System.out::println);
        personList.stream().sorted(Comparator.comparing(Person2::getAge).reversed().thenComparing(Person2::getSalary)).forEach(System.out::println);
        Integer collect3 = personList.stream().collect(Collectors.summingInt(Person2::getAge));
        System.out.println(collect3);

        System.out.println("maxAgePerson" + personList.stream().max(Comparator.comparing(Person2::getAge)));
        System.out.println("maxage" + personList.stream().max(Comparator.comparing(Person2::getSalary)));
        System.out.println("maxAgePerson1:" + personList.stream().collect(Collectors.maxBy(Comparator.comparing(Person2::getAge))));
        System.out.println("maxAgePerson2:" + personList.stream().max(Comparator.comparingInt(Person2::getAge)));
        System.out.println("maxAge1:" + personList.stream().map(Person2::getAge).max(Integer::compare));
        System.out.println("maxAge2:" + personList.stream().map(Person2::getAge).reduce(Integer::max));
        System.out.println("maxAge3:" + personList.stream().map(Person2::getSalary).collect(Collectors.maxBy(Integer::compare)));


        System.out.println("按薪资降序：");
        personList.stream().sorted(Comparator.comparing(Person2::getSalary).reversed()).forEach(System.out::println);
        System.out.println("按年龄遍历：");
        personList.stream().forEach(Person2::getAge);
        System.out.println("按年龄降序然后按薪资降序：");
        personList.stream().sorted(Comparator.comparing(Person2::getAge).thenComparing(Person2::getSalary).reversed()).forEach(System.out::println);
        System.out.println("按年龄升序然后按薪资降序：");
        personList.stream().sorted(Comparator.comparing(Person2::getAge).thenComparing(Person2::getSalary, Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("按年龄降序然后按薪资升序：");
        personList.stream().sorted(Comparator.comparing(Person2::getAge, Comparator.reverseOrder()).thenComparing(Person2::getSalary)).forEach(System.out::println);
        System.out.println("年按年龄降序的年龄:");
        personList.stream().map(Person2::getAge).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("含A的名字然后按性别分类");
        System.out.println(personList.stream().filter(e -> e.getName().contains("A")).collect(Collectors.groupingBy(e -> e.getSex())));

        System.out.println("join连接：");
        String collect5 = personList.stream().map(Person2::getName).collect(Collectors.joining("-><-"));
        System.out.println(collect5);

        System.out.println("this is test");

    }


}

@Data
@Builder
class Person1 {
    private String name;  // 姓名
    private int salary; // 薪资
    private int age; // 年龄
    private String sex; //性别
    private String area;  // 地区
}


@Data
class Person3 {


    private String name;
    private Integer age;
    private String city;
    private Integer height;
}

@Data
@Builder
class Student {
    private String name;
    private int age;

}
