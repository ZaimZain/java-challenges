package Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args){
        AnagramChecker ac = new AnagramChecker();
        String first = ac.scan();
        String second = ac.scan();
        ac.print(ac.checker(first.toUpperCase(),second.toUpperCase()));
    }

    public String scan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input String : ");
        return scan.next();
    }

    public boolean checker(String first, String second){
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

    public void print(boolean flag){
        System.out.println(flag?"Is Anagram":"Is not");
    }
}
