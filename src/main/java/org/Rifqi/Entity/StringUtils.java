package org.Rifqi.Entity;

import java.util.Locale;

public class StringUtils {
    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static int countVowel(String word) {
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            switch (character) {
                case 'a':
                case 'i':
                case 'u':
                case 'e':
                case 'o':
                    count++;
                    break;
            }
        }
        return count;
    }

    public static boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] wordCount = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            wordCount[word1.charAt(i) - 'a']++;
            wordCount[word2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < wordCount.length; i++) {
            if (wordCount[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
