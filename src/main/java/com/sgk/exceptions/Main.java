package com.sgk.exceptions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Before throw");
        OneThreadExceptionThrow.doThrow();
        System.out.println("After throw");
    }
}
