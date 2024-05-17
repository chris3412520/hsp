package com.hspedu.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("汤姆");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog,bone);
//        Master master = new Master("汤姆");//错误，变量命名为master Master类似基本数据类型int 可以创建多个变量
//        Dog dog = new Dog("大黄~");//不是new Animal
//        Bone bone = new Bone("大棒骨~");
//        tom.feed(dog, bone);调用Master类其中的方法feed，feed有两个参数

        Cat cat = new Cat("小花猫~");
        Fish fish = new Fish("黄花鱼~");
        System.out.println("===========-------");
        tom.feed(cat, fish);

//        //添加 给小猪为米饭
//        Pig pig = new Pig("小花猪");
//        Rice rice = new Rice("米饭");
//        System.out.println("===================");
//        tom.feed(pig, rice);
        //添加 给小猪喂米饭
        Pig pig = new Pig("小花猪");
        Fish rice = new Fish("米饭");
        System.out.println("==============");
        tom.feed(pig,fish);
    }
}
