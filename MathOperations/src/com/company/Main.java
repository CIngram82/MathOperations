package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //        Ask the user to input two numbers
        //        Get the numbers as Strings using Scanner

        System.out.println("Enter the 1st number:");
        Scanner pants = new Scanner(System.in);
        String userInput = pants.nextLine();
        Double firstNum = Double.parseDouble(userInput);
        System.out.println("Enter the 2nd number:");
        userInput = pants.nextLine();
        //        Convert a String to a double using Double.parseDouble. Save the the first double value in an operand1 variable and the second double value in an operand2 variable
        Double secondNum = Double.parseDouble(userInput);
        //        Add the operands and save in a sum variable
        //        Subtract the operands and save in a difference variable
        //        Divide the operands and save in a division variable
        //        Multiple the operands and save in a multiplication variable
        Double sum = firstNum + secondNum;
        Double difference = firstNum - secondNum;
        Double multiplication = firstNum * secondNum;
        Double division = firstNum / secondNum;

        //        Find the remainder when one operand is divided by the other and save in a remainder variable. See this page if you need to learn more about the remainder operator.
        Double remainder = firstNum % secondNum;

        //        Call a showResults method and pass the sum, difference, division, multiplication and remainder variables as arguments.
        showResultes(sum, difference, division, multiplication, remainder);

//        Extras
//
//        Try some of the other Java operators which can be found at Operators
    }

    private static void showResultes(Double sum, Double difference, Double division, Double multiplication, Double remainder) {
        //        In the showResults method output the parameters with some meaningful text (e.g. The sum is 10.5).
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The division is " + division);
        System.out.println("The multiplication is " + multiplication);
        System.out.println("The remainder is " + remainder);

    }
}
