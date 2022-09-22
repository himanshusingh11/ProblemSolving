package Strings;

import java.util.Scanner;

public class String1 {
    public static  int numJewelsInStones(String jewels, String stones) {
        char[] s = jewels.toCharArray();
        char [] s1 = stones.toCharArray();
        int count = 0;
        for (char c : s) {
            for (char value : s1) {
                if (c == value) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(numJewelsInStones(s1,s2));
    }

}
