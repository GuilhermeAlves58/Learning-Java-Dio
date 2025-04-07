package problem_set.methods;

import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the loan amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the number of installments (e.g., 6, 12, 24):");
        int installments = scanner.nextInt();

        double interestRate;

        interestRate = switch (installments) {
            case 1, 2, 3, 4, 5, 6 -> 0.05;
            case 7, 8, 9, 10, 11, 12 -> 0.10;
            case 13, 14, 15, 16, 17, 18 -> 0.15;
            default -> 0.20;
        };

        double finalAmount = principal + (principal * interestRate);
        double installmentValue = finalAmount / installments;

        System.out.printf("Interest rate applied: %.2f%%%n", interestRate * 100);
        System.out.printf("Final amount to pay: $%.2f%n", finalAmount);
        System.out.printf("Installment value: $%.2f (%d installments)%n", installmentValue, installments);

        scanner.close();
    }
}
