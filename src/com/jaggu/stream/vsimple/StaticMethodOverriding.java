package com.jaggu.stream.vsimple;

class Parent{
    static void show(){
        System.out.println("Parent");
    }

}

class Child extends  Parent{
    static void show(){
        System.out.println("Chile");
    }
}
public class StaticMethodOverriding {
    public static void main(String[] args) {

        Parent p  = new Child();
        p.show();

        // The above is called as the method hiding not the overriding



    }
}
