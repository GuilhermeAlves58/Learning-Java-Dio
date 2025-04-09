package problem_set.BasicAlgorithmsProblems;
import java.util.Scanner;

public class packageDownload {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho;
        do {
            tamanho = leitor.nextInt();
        } while (tamanho > 10 || tamanho < 1);
        for (int i = 0; i < tamanho; i++) {
            System.out.print('/');
        }

        System.out.println();
    }
}

