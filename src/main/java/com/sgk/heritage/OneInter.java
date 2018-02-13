package com.sgk.heritage;

public interface OneInter {
    default void overridenMethod(String s)     {
        System.out.println("default implementation oneinter");
    }
    Integer theOneMethod();
}
