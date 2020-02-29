package com.sunqc.javacore.base;

/**
 * 测试按值传递
 */
class Dog{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {

    }
}
public class TestChuanDi {
    /**
     * 方法得到的是对象引用的拷贝，对象引用和其他拷贝同时引用同一个对象。
     * @param dog
     */
    public static void changeDogName(Dog dog){
        dog.setName("change");
    }

    public static void main(String[] args) {
        Dog testDog = new Dog("original",12);
        changeDogName(testDog);
        System.out.println(testDog.getName());
    }
}
