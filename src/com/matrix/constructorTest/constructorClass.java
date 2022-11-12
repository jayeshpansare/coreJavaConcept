package com.matrix.constructorTest;

public class constructorClass {
    /* used to initialize object

    Type of constructor
    1. Default Constructor/No-args/0-parameter constructor
    2. parameterize
     */
    //access_specifier  Class_Name
    public constructorClass(){
        // default
    }

    /* public constructorClass(int 10){
    }
     */

    public static void main(){
        // class name object = create a constructor , name of constructor
        constructorClass obj = new constructorClass();
        obj.getData();
    }

    public int getData(){
        return 10;
    }
}
