package com.matrix.constructorTest;

public class ConstructureOverloading {
    public ConstructureOverloading(){
        System.out.println("jayesh");
    }
    public ConstructureOverloading(int x){
        System.out.println(x);
    }
    public static void main(String[] args){
        new ConstructureOverloading();
        new ConstructureOverloading(11);
    }
}
