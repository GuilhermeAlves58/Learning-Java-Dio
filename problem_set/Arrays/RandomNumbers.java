package problem_set.Arrays;


import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomnumbers = new int[20];

        for (int i = 0; i < randomnumbers.length; i++) {
            int num = random.nextInt(100);
            randomnumbers[i] = num;

        }
        System.out.print("Random numbers: ");
        for (int number : randomnumbers) {
            System.out.print(number + " ");
        }
        System.out.print("\nRandom numbers++: ");
        for (int number : randomnumbers) {
            System.out.print(number + 1 + " ");
        }
        System.out.print("\nRandom numbers--: ");
        for (int number : randomnumbers) {
            System.out.print(number -1 + " ");
        }
    }
}
