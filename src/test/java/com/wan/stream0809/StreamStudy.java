package com.wan.stream0809;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStudy {
    public static void main(String[] args) {
        List<Person12> personList = new ArrayList<Person12>();

        personList.add(new Person12("Sherry", 9000, 24, "female", "New York"));
        personList.add(new Person12("Tom", 8900, 22, "male", "Washington"));
        personList.add(new Person12("Jack", 9000, 25, "male", "Washington"));
        personList.add(new Person12("Lily", 8800, 26, "male", "New York"));
        personList.add(new Person12("Alisa", 9000, 26, "female", "New York"));

        // 按工资升序排序（自然排序）
        List<String> newList = personList.stream().sorted(Comparator.comparing(Person12::getSalary)).map(Person12::getName)
                .collect(Collectors.toList());
        // 按工资倒序排序
        List<String> newList2 = personList.stream().sorted(Comparator.comparing(Person12::getSalary).reversed())
                .map(Person12::getName).collect(Collectors.toList());
        // 先按工资再按年龄升序排序
        List<String> newList3 = personList.stream()
                .sorted(Comparator.comparing(Person12::getSalary).thenComparing(Person12::getAge)).map(Person12::getName)
                .collect(Collectors.toList());
        // 先按工资再按年龄自定义排序（降序）
        List<String> newList4 = personList.stream().sorted((p1, p2) -> {
            if (p1.getSalary() == p2.getSalary()) {
                return p2.getAge() - p1.getAge();
            } else {
                return p2.getSalary() - p1.getSalary();
            }
        }).map(Person12::getName).collect(Collectors.toList());

        System.out.println("按工资升序排序：" + newList);
        System.out.println("按工资降序排序：" + newList2);
        System.out.println("先按工资再按年龄升序排序：" + newList3);
        System.out.println("先按工资再按年龄自定义降序排序：" + newList4);
    }
}

@Data
@AllArgsConstructor
class Person12 {
    private String name;  // 姓名
    private int salary; // 薪资
    private int age; // 年龄
    private String sex; //性别
    private String area;  // 地区

}
