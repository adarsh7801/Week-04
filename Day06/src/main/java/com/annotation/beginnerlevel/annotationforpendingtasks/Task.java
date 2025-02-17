package com.annotation.beginnerlevel.annotationforpendingtasks;

public class Task {

    @Todo(task = "", assignedTo = "", priority = "High")
    public void abc(){
        System.out.println("ABC");
    }

    @Todo(task = "Def", assignedTo = "", priority = "Medium")
    public void def(){
        System.out.println("DEF");
    }

    @Todo(task = "Ghi", assignedTo = "", priority = "Low")
    public void ghi(){
        System.out.println("GHI");
    }


}
