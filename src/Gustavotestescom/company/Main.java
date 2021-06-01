package Gustavotestescom.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int number [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

  	int number2 [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

  	int number3 [] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.println("all numbers are " + Arrays.toString(number));

        System.out.println("the even numbers are " + Arrays.toString(number2));

        System.out.println("The odd numbers are " + Arrays.toString(number3));
    }
}
