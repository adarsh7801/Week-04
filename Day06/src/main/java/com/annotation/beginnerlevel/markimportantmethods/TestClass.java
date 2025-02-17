package com.annotation.beginnerlevel.markimportantmethods;

public class TestClass {

    @ImportantMethod(level = "High")
    public void  function1(){
        System.out.println("High");
    }

    @ImportantMethod(level = "Medium")
    public void function2(){
        System.out.println("Medium");
    }

    @ImportantMethod(level = "Default")
    public void function3(){
        System.out.println("Default");
    }

}
