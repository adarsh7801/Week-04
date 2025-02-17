package com.annotation.beginnerlevel.annotationforpendingtasks;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Class<Task> taskClass = Task.class;

        for (Method method : taskClass.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Todo.class)){

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println(todo.task());
                System.out.println(todo.assignedTo());
                System.out.println(todo.priority());

            }

        }


    }
}