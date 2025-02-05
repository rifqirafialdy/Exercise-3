package org.Rifqi.Entity;

import java.lang.reflect.Array;

public class NumberUtils {
    public static int calculateNumbers(int number) {
        String[] numbers = String.valueOf(number).split("");
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        return sum;
    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;


    }

    public static int largestNumber(int[] number) {
        int maxNumber = number[0];
        for (int i = 0; i < number.length; i++)
            if (number[i] > maxNumber)
                maxNumber = number[i];
        return maxNumber;
    }

    public static int[] fibonnaci(int n) {
        int[] fibSeq = new int[n];
        if (n > 0) fibSeq[0] = 0;
        if (n > 1) fibSeq[1] = 1;
        for (int i = 2; i < n; i++) {
            fibSeq[i] = fibSeq[i - 1] + fibSeq[i - 2];
        }
        return fibSeq;
    }

    public static int secondSmallestNumber(int[] number) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < firstSmallest) {
                System.out.println(number[i]);
                secondSmallest = firstSmallest;
                System.out.println(firstSmallest);
                firstSmallest = number[i];
                System.out.println(secondSmallest);
            } else if (number[i] > firstSmallest && number[i] < secondSmallest) {
                secondSmallest = number[i];
            }
        }
        return secondSmallest;
    }

    public static int[] sortNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static double calculator(double number1, double number2, char operator) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 == 0) {
                    throw new IllegalArgumentException("cant divide by zero");
                }
                return number1 / number2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

}

