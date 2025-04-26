package debugging;

import java.util.Scanner;
    public class CalculadoraDeMedias {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String[] students = {"Camila", "Lucas", "Bruna", "Pedro"};

            double media = classAverageCalculator(students, scan);

            System.out.printf("Average: %.1f", media);
        }

        public static double classAverageCalculator(String[] students, Scanner scanner) {

            double sum = 0;
            for(String student : students) {
                System.out.printf("Student's grade %s: ", student);
                double grade = scanner.nextDouble();
                sum += grade;
            }

            return sum / students.length;
        }
    }
