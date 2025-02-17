package com.annotation.beginnerlevel.markimportantmethods;

import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void main(String[] args) {

        Class<TestClass> obj = TestClass.class;

        for (Method method : obj.getDeclaredMethods()) {

            if (method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Mehtod: " +method.getName() +"Level: "+annotation.level());
            }

        }

    }

}
