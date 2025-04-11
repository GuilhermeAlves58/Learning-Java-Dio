package problem_set.BasicAlgorithmsProblems;
import java.util.Scanner;

public class leituraDaGertrudes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quantas páginas");
            int paginas = scanner.nextInt();

            int dias = paginas / 3;

            if (paginas % 3 != 0) {
                dias += 1;
            }

            System.out.println(dias + " dias");

            scanner.close();
        }
}
