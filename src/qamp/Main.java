package qamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner reader = new Scanner(System.in);
        System.out.println("Please choose the action you want (1,2,3,4,5,6,7): \n1.Sum of 2 numbers \n2.Difference of 2 numbers \n3.Product of 2 numbers \n4.Quotient of 2 numbers \n5.Area of a circle \n6.Sum of N elements \n7.Product of N elements");
        int action = reader.nextInt();
        if (action == 1 || action == 2 || action == 3 || action == 4) {
            myCalculator.setNumberA(numberA());
            myCalculator.setNumberB(numberB());
        } else if (action == 5) {
            myCalculator.setNumberA(radius());
        } else if (action == 6 || action == 7) {
            myCalculator.setMyArray(array());
        } else {
            System.out.println("You choose wrong action!");
        }
        switch (action) {
            case 1:
                System.out.println("Sum of numbers " + myCalculator.numberA + " and " + myCalculator.numberB + " is " + myCalculator.sum());
                break;
            case 2:
                System.out.println("Difference of numbers " + myCalculator.numberA + " and " + myCalculator.numberB + " is " + myCalculator.diff());
                break;
            case 3:
                System.out.println("Product of numbers " + myCalculator.numberA + " and " + myCalculator.numberB + " is " + myCalculator.product());
                break;
            case 4:
                System.out.println("Quotient of numbers " + myCalculator.numberA + " and " + myCalculator.numberB + " is " + myCalculator.quotient());
                break;
            case 5:
                System.out.println("Area is: " + myCalculator.areaWithRadiusNumberA());
                break;
            case 6:
                System.out.println("Sum of elements in array is " + myCalculator.sumElementInArray(myCalculator.myArray));
                break;
            case 7:
                System.out.println("Product of elements in array is " + myCalculator.productElementInArray(myCalculator.myArray));
                break;
        }
    }

    public static int numberA() {
        System.out.println("Please enter a first integer");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static int numberB() {
        System.out.println("Please enter a second integer");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static int radius() {
        System.out.println("Please enter a radius");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static int enterElementsInArray() {
        System.out.println("Please enter the array element");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static int[] array() {
        System.out.println("How many elements do you want into array");
        Scanner reader = new Scanner(System.in);
        int numberOfElement = reader.nextInt();
        int[] array = new int[numberOfElement];
        for (int i = 0; i < numberOfElement; i++) {
            array[i] = enterElementsInArray();
        }
        return array;
    }
}
