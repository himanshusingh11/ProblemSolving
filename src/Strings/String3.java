package Strings;

import java.util.Scanner;

public class String3 {
    static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U');
    }

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static boolean halvesAreAlike(String s) {
        String s1 = s.substring(0, (s.length() / 2));
        String s2 = s.substring(s.length() / 2, s.length());

        int count1 = countVowels(s1);
        int count2 = countVowels(s2);
        return count1 == count2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(halvesAreAlike(s));

    }
}

//link https://leetcode.com/problems/determine-if-string-halves-are-alike/