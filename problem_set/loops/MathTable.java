package problem_set.loops;
import java.util.Scanner;

public class MathTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int table;
        int x = 1;
        System.out.println("Math Table: ");
        table = scan.nextInt();
        do{
            int result = table * x;
            System.out.println(table +"x"+ x + "=" + result);
            ++x;
        }while (x <= 10);

    }
}
