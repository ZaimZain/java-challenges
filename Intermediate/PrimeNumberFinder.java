package Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        PrimeNumberFinder prime = new PrimeNumberFinder();
        System.out.println("Please select your action (0 for List; 1 for Checker): ");
        if (prime.scanInt() == 0) {
            prime.print(prime.primeList(prime.scanInt()));
        } else {
            prime.print(prime.primeFinder(prime.scanInt()));
        }
    }

    public int scanInt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your number: ");
        try {
            return scan.nextInt();
        } catch (InputMismatchException e) {
            return 1;
        }
    }

    public boolean primeFinder(int input) {
        for (int i = 2; i < input; i++) {
            if (input % i == 0) return false;
        }
        return input != 1;
    }

    public ArrayList primeList(int input) {
        ArrayList result = new ArrayList();
        boolean flag = true;

        for (int i = 2; i <= input; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) result.add(i);
            flag = true;
        }
        return result;
    }

    public void print(boolean flag) {
        System.out.println(flag ? "Is Prime Number!" : "Is not");
    }

    public void print(ArrayList list) {
        System.out.println(list);
    }
}
