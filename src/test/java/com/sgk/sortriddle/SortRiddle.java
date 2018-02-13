package com.sgk.sortriddle;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SortRiddle {

    private boolean verifyCorrectness(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        int change = 0;
        Integer prev = iterator.next();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 1 && prev % 2 == 0) {
                change++;
            } else if (next % 2 == 0 && prev % 2 == 1) {
                change++;
            }
            prev = next;
        }
        return change == 1;
    }

    @Test
    public void run_1() {
        List<Integer> integers = Arrays.asList(1, 2, 4, 15, 23, 3, 6 , 5, 9 ,11 ,0 , 22, 1, 2, 8, 10, 16);
        integers.sort((a, b) -> {
            if (a % 2 == 0 && b % 2 == 1) {
                return 1;
            } else if (a % 2 == 1 && b % 2 == 0) {
                return -1;
            }
            return 0;
        });


        System.out.println(integers);
        System.out.println(verifyCorrectness(integers));
    }



    @Test
    public void run_2() {
        List<Integer> integers = Arrays.asList(1, 2, 4, 15, 23, 3, 6 , 5, 9 ,11 ,0 , 22, 1, 2, 8, 10, 16);
        integers.sort((a, b) -> {
            if (b % 2 == 0) { // even
                return 1;
            }
            return -1;

        });


        System.out.println(integers);
        System.out.println(verifyCorrectness(integers));

    }
}
