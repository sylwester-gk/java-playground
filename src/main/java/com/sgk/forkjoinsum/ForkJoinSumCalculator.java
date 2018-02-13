package com.sgk.forkjoinsum;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.logging.Logger;
import java.util.stream.LongStream;

/**
 * ForkJoinSumCalculator
 * <p>
 * Created by gebczyks on 2017-06-02.
 */
public class ForkJoinSumCalculator extends RecursiveTask<Long> {

    private static final Logger logger = Logger.getLogger(ForkJoinSumCalculator.class.getName());
    private static final long THRESHOLD = 10_000;

    private final long[] numbers;
    private final int start;
    private final int end;

    private ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        logger.info("Created ForkJoinSumCalculator");
    }

    public ForkJoinSumCalculator(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    public static long forkJoinSum(long n) {
        long[] longs = LongStream.rangeClosed(1, n).toArray();
        ForkJoinSumCalculator sum = new ForkJoinSumCalculator(longs);
        return new ForkJoinPool().invoke(sum);
    }

    @Override
    protected Long  compute() {
        logger.info("Compute called. Start: " + start + ", end: " + end);
        int length = end - start;
        if (length <= THRESHOLD) {
            return computeSequentially();
        }
        ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(numbers, start, start + length / 2);
        leftTask.fork();
        ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers, start + length / 2, end);
        Long rightResult = rightTask.compute();
        Long leftResult = leftTask.join();
        return leftResult + rightResult;
    }

    private long computeSequentially() {
        logger.info("Computing sequentially");
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
