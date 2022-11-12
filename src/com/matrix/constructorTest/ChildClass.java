package com.matrix.constructorTest;

public class ChildClass extends ChildClass1 {
    static{
        System.out.println("static block");
    }

    static{
        System.out.println("static block 2");
    }

    {
        System.out.println("This is instance block");
    }
    public ChildClass(){
        System.out.println("This is child class");
    }

    public ChildClass(int x){
        System.out.println("This is "+x+" class");
    }

    public static void main(String[] args){
        new ChildClass().ChildClass();
        new ChildClass(11);
    }

    public int ChildClass(){
        System.out.println("yyy");
        return 10;
    }
}
