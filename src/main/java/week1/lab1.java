package week1;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Harun Musa");

        System.out.println();

        System.out.println("Hello World!");
        System.out.println("(And all people of the world)");

        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;

        long totalSeconds = (long) daysInYear * hoursInDay * minutesInHour * secondsInMinute;

        System.out.println("There are " + totalSeconds + " seconds in a year.");

        System.out.println();

        System.out.println("Enter the first integer:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum + ".");

        System.out.println();

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else {
            System.out.println("The number " + number + " is not positive.");
        }

        System.out.println("Enter the first number:");
        int firstNumber1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber2 = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The greater number is: " + firstNumber1);
        } else if (secondNumber > firstNumber) {
            System.out.println("The greater number is: " + secondNumber2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
