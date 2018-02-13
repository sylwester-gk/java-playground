package com.sgk.exceptions;

public class OneThreadExceptionThrow {
    public static void doThrow() {
        if (true) {
            throw new RuntimeException("test");
        }
        System.out.println("print");
    }
}
