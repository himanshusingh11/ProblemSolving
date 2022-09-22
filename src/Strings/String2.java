package Strings;

import java.util.Scanner;

public class String2 {
//this is second program
    //this is comment for git

    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] temp = new String[arr.length];
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i].charAt(arr[i].length() - 1) - '0'; //trying to get the number in word
            temp[index - 1] = arr[i].substring(0, arr[i].length() - 1); //placing at correct position at temp array
        }
        for (int i = 0; i < temp.length; i++) {
            res += temp[i];
            res += " ";
        }

        return res.trim(); //removing the white spaces
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sortSentence(s));
    }
}
//Link for the problem
//https://leetcode.com/problems/sorting-the-sentence/