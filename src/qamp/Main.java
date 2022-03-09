package qamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.setNumberA(number());
        myCalculator.setNumberB(number());
        myCalculator.setMyArray(new int[]{3, 6, 8, 9});
        System.out.println("Sum of numbers " + myCalculator.numberA + " and " + myCalculator.numberB + " is " + myCalculator.sum());
        System.out.println("Difference of numbers " + myCalculator.numberA + " and " + myCalculator.numberB + " is " + myCalculator.diff());
        System.out.println("Product of numbers " + myCalculator.numberA + " and " + myCalculator.numberB + " is " + myCalculator.product());
        System.out.println("Quotient of numbers " + myCalculator.numberA + " and " + myCalculator.numberB + " is " + myCalculator.quotient());
        System.out.println("Area of a circle with radius " + myCalculator.numberA + " is " + myCalculator.areaWithRadiusNumberA());
        System.out.println("Area of a circle with radius " + myCalculator.numberB + " is " + myCalculator.areaWithRadiusNumberB());
        System.out.println("Sum of elements in array is " + myCalculator.sumElementInArray(myCalculator.myArray));
        System.out.println("Product of elements in array is " + myCalculator.productElementInArray(myCalculator.myArray));
    }
    public static int number (){
        System.out.println("Please enter a number");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }
}