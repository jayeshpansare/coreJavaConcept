package com.matrix.constructorTest;

public class ConstructureChaining {
    public ConstructureChaining(){
        this(10);
        System.out.println("test");
    }

    public ConstructureChaining(int x){
        this(12, "jayesh");
        System.out.println(x);
    }

    public ConstructureChaining(int x, String y){
        System.out.println(x+" "+ y);
    }

    public static void main(String[] args){
        new ConstructureChaining();
        new ConstructureChaining(33);
    }
}
