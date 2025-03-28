package problem_set.loops;
import java.util.Scanner;

public class NameAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;

        while(true){
            System.out.printf("Name: ");
            name = scan.next();
            if (name.equals("0")){
                break;
            }
            System.out.printf("Age: ");
            age = scan.nextInt();

        }
    }
}

