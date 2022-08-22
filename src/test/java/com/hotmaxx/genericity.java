//package com.hotmaxx.demo;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AnimalCatGarfield {
//    public static void main(String[] args) {
//        // 第一段：声明三个依次继承的集合：Animal > Cat > Garfield
//        List<Animal> animals = new ArrayList<>();
//        List<Cat> cats = new ArrayList<>();
//        List<Garfield> garfields = new ArrayList<>();
//        animals.add(new Animal());
//        cats.add(new Cat());
//        garfields.add(new Garfield());
//
//        // 第二段：测试赋值操作
//        // 下行编译报错，只能赋值Cat或Cat的子类
//        List<? extends Cat> extendsCatsFromAnimal = animals;
//        List<? extends Cat> extendsCatsFromCat = cats;
//        List<? extends Cat> extendsCatsFromGarfield = garfields;
//
//        List<? super Cat> superCatsFromAnimal = animals;
//        List<? super Cat> superCatsFromCat = cats;
//        // 该行编译报错，只能赋值Cat或Cat的父类
//        List<? super Cat> superCatsFromGarfield = garfields;
//
//        // 第三段：测试add方法
//        // <? extends T> 添加受限，除了add(null)其它都编译报错
//        extendsCatsFromCat.add(new Animal());
//        extendsCatsFromCat.add(new Cat());
//        extendsCatsFromCat.add(new Garfield());
//        extendsCatsFromCat.add(null);
//
//        // 下行编译报错，只能添加Cat或Cat的子类
//        superCatsFromCat.add(new Animal());
//        superCatsFromCat.add(new Cat());
//        superCatsFromCat.add(new Garfield());
//
//        // 第四段：测试get方法
//        Cat cat = extendsCatsFromCat.get(0);
//        // 下行编译报错，取出的类型带有泛型限制，都向上转型为Cat
//        Garfield garfield = extendsCatsFromGarfield.get(0);
//        // 所有super的泛型都能取出数据，但是会泛型丢失，只能返回Object类型元素
//        Object object = superCatsFromCat.get(0);
//    }
//}
//class Animal{}
//class Cat extends Animal{}
//class Garfield extends Cat{}
//}
