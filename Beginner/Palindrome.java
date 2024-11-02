package Beginner;

import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args){
        Palindrome palindrome = new Palindrome();
        String input = palindrome.input();
        palindrome.print(palindrome.checkPalindrome(input));
    }

    public String input(){
        System.out.println("Insert your word :");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public boolean checkPalindrome(String input){
        String reverse ="";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        return reverse.equals(input)?true:false;
    }

    public void print(boolean input){
        System.out.println(input);
    }
}
