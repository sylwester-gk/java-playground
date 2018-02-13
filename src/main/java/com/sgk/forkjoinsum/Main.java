package com.sgk.forkjoinsum;


import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Start");
        long l = ForkJoinSumCalculator.forkJoinSum(30000);
        logger.info("Sum: " + l);
    }
}
