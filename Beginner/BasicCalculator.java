package Beginner;

import java.util.Scanner;
import java.util.stream.Stream;

public class BasicCalculator {
    public static final Scanner scan = new Scanner(System.in);
    public static int count = 0;

    public static void main (String[] args){
        BasicCalculator bc = new BasicCalculator();
        boolean cont = false;
        String operator = "";

        double input = bc.inputDouble();
        double input1 = bc.inputDouble();

        do{
            System.out.println("Operator: ");
            operator = bc.input();
            bc.print(bc.calculator(input,input1,operator));

            try{
                System.out.println("Continue?");
                cont = scan.nextBoolean();
            } catch (Exception e) {
                break;
            }
        }while(cont);
    }

    public String input(){
        return scan.next();
    }

    public double inputDouble(){
        count++;
        System.out.printf("Number %d: ",count);
        return scan.nextDouble();
    }

    public double calculator(double input, double input1, String symbol){
        double result = 0;
        switch (symbol) {
            case "+":
                result = input + input1;
                break;
            case "-":
                result = input - input1;
                break;
            case "*":
                result = input * input1;
                break;
            case "/":
                result = input / input1;
                break;
            default:
        }
        return result;
    }

    public void print(double result){
        System.out.println(result);
    }
}
