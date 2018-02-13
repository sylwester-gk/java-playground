package com.sgk.heritage;

public interface OtherInter extends BasicInter {

    String otherMethod();

    default void overridenMethod(String s)
    {
        System.out.println("default implementation other");
//        privInterMethod();
    }

//    private void privInterMethod() {
//        System.out.println("im a private interface method");
//    }
}
