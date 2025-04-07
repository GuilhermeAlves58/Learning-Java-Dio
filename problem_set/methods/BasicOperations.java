package problem_set.methods;

import java.util.Scanner;

import java.util.Scanner;

public class BasicOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Choose the operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num2 == 0 ? Double.POSITIVE_INFINITY : num1 / num2;
                break;
            default:
                validOperation = false;
                break;
        }

        System.out.println(validOperation
                ? (operator == '/' && num2 == 0
                ? "Error: Division by zero is not allowed."
                : "Result: " + result)
                : "Invalid operation.");

        scanner.close();
    }
}