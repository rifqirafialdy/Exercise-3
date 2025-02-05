package org.Rifqi;

import org.Rifqi.Entity.NumberUtils;
import org.Rifqi.Entity.StringUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(NumberUtils.calculateNumbers(1234));
        int[] numbers = {1000, 220, 1, 45, 57};
        int[] numbersString = NumberUtils.sortNumber(numbers);
        System.out.println(NumberUtils.sortNumber(numbers));
        int[] fibRes = NumberUtils.fibonnaci(1);
        System.out.println(Arrays.toString(numbersString));
        System.out.print(StringUtils.isAnagram("budi", "udib") + "\n");
        System.out.println(NumberUtils.calculator(1, 4, '/'));

        System.out.print(NumberUtils.isPrime(4));
        System.out.print(StringUtils.reverseWord("hello"));
        System.out.println(StringUtils.countVowel("Hello"));


    }
}