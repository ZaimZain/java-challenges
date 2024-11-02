package Beginner;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        FibonacciSequenceGenerator fibo = new FibonacciSequenceGenerator();

        ArrayList<Integer> fibonacciSeq = new ArrayList<Integer>();
        int maxSequence = fibo.scan();
//        ArrayList<Integer> result = fibo.calculate(maxSequence, fibonacciSeq);
//        fibo.print(result);
        double resultFormula = fibo.calculateFormula(maxSequence);
        fibo.print(resultFormula);
    }

    public int scan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Fn: ");
        return sc.nextInt();
    }

    public ArrayList<Integer> calculate(int maxSequence, ArrayList<Integer> fibonacciSeq) {
        int result = (maxSequence == 0 || maxSequence == 1 ? maxSequence : 0);
        fibonacciSeq.add(0);
        fibonacciSeq.add(1);

        for (int cur = 2; cur < maxSequence+1; cur++) {
            result = fibonacciSeq.get(cur - 1).intValue() + fibonacciSeq.get(cur - 2).intValue();
            fibonacciSeq.add(result);
        }
        return fibonacciSeq;
    }

    public double calculateFormula(int maxSequence){
        //( (1 + √5)^n - (1 - √5)^n ) / (2^n × √5)
        return (Math.pow(1 + Math.sqrt(5),maxSequence) - Math.pow(1 - Math.sqrt(5),maxSequence))/ (Math.pow(2,maxSequence) * Math.sqrt(5));
    }

    public void print(ArrayList<Integer> results) {
        for (double result : results)
            System.out.println("Fibonacci: " + result);
    }

    public void print(double result) {
            System.out.println("Fibonacci: " + result);
    }
}
