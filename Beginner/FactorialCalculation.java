package Beginner;

import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args){
        FactorialCalculation fc = new FactorialCalculation();
        int input = fc.scan();
        int result = fc.calculate(input);
        fc.print(result);
    }

    public int scan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number");
        return sc.nextInt();
    }

    public int calculate(int input){
        int result = 1;
        for(int i=input; i>0; i--){
            result*=i;
        }
        return result;
    }

    public void print(int result){
        System.out.println("Factorial: "+result);
    }
}
