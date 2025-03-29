package problem_set.loops;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade;
        while(true){
            System.out.printf("Grade: ");
            grade = scan.nextInt();
            if(grade > 10){
                System.out.printf("Invalid value");
                break;
            }
            else if (grade < 0) {
                System.out.printf("Invalid value");
                break;
            }
        }
    }
}
