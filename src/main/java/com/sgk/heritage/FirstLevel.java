package com.sgk.heritage;

public class FirstLevel implements OtherInter, OneInter {
    @Override
    public Integer theOneMethod() {
        return 1;
    }

    @Override
    public String otherMethod() {
        return "some string";
    }

    @Override
    public void overridenMethod(String s) {
        OtherInter.super.overridenMethod(s);
    }

//    @Override
//    public void overridenMethod(String s) {
//        ((OtherInter)this).overridenMethod(s);
//        System.out.println("overriden method: " + s);
//    }

    @Override
    public void basicMethod() {
        System.out.println("basicMethod");

    }


}
