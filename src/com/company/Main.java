package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code h
        double[] numbers ={1.3,7.8,3.27,6.2,54.6,3.5,7.46,5.2,6.5,6.8,47.48,5};
        double col =0.0;
        int s = 0;
        boolean m = false;

        for (double sum : numbers) {
            if (sum < 0) {
                m = true;
            } else if (m) {
                col = col + sum;
                s++;
            }
        }

        double id = col / s;
        System.out.println(id);




        int[] numberss = new int[]{-2,-47,56,-36,46,2};
        boolean sort = false;
        while (!sort){
            sort = true;
            for (int i = 1; i< numberss.length; i++) {
                if (numberss[i] < numberss[i - 1]) {
                    int w = numberss[i];
                    numberss[i] = numberss[i - 1];
                    numberss[i - 1] = w;
                    sort = false;
                }
            }
            System.out.println(Arrays.toString(numberss));
        }
    }
}
