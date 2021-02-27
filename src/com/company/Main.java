package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	double[] array = {1.2, -2.5, 3.2, 8.6,-6.2};
	double sum = 0;
	int k = 0;
	boolean poz = false;

        for (double arr: array) {
            if(arr < 0) {
                poz = true;

            }

            if (poz == true){
                if (arr > 0) {
                    sum = sum + arr;
                    k = k + 1;
                }
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма: " + sum + " Количество: " + k + "\n Среднее арифметическое " + sum/k);


    }
}
