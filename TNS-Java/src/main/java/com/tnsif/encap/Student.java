package com.tnsif.encap;

class Test{
    private String name;
    private int age;

    public void display(){
        name = "God";
        age = 99999999;

        System.out.println("Name : "+name+"\nAge : "+age);
    }
}
public class Student{
    public static void main(String[] args) {
        Test t = new Test();
        t.display();

    }
}
