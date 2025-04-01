package problem_set.loops;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int numberp = 0;
        int numberi = 0;
        int count = 0;
        do{
            System.out.println("Type a Number: ");
            number = scan.nextInt();
            ++count;
            if(number % 2 == 0){
                ++numberp;
            }
            else{
                ++numberi;
            }
        } while (count < 5);
        System.out.println("Numbers p: "+ numberp);
        System.out.println("Numbers i: "+ numberi);
    }

}
