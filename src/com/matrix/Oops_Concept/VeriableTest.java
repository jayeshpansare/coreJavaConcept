package com.matrix.Oops_Concept;

public class VeriableTest {
    static final int MAX_NUMBER = 10;  // static Variables
    String str = "jayesh";  // global Instance  Variables
    boolean br = true;

    //accessSpecifier returnType methodName
    public static void main(String[] args){
        VeriableTest obj = new VeriableTest();
        obj.addTwoNumbers();

    }

    public void addTwoNumbers(){
        int minNumber = 20;  // Local Variables
        System.out.println(br);
        System.out.println(str);
        /* System - class name
        out - static Variable
        println - method name
         */
    }
}
