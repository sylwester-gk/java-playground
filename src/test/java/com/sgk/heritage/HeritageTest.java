package com.sgk.heritage;

import org.junit.Test;

public class HeritageTest {
    @Test
    public void compileTest() {
        FirstLevel firstLevel = new FirstLevel();
        firstLevel.basicMethod();
        System.out.println(firstLevel.otherMethod());
        firstLevel.overridenMethod("nothing");

        System.out.println(firstLevel.toString());


    }
}
