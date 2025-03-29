package problem_set.loops;
import java.util.Scanner;


public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int count = 0;
        int ave = 0;
        int larger = 0;
        do{
            System.out.printf("Number: ");
            number = scan.nextInt();
            ave += number;
            ++count;
            if(number > larger){
                larger = number;
            }
        }while(count < 5);
        System.out.println("Larger: "+ larger);
        System.out.println("average: "+ ave / 5);
    }
}
