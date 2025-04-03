package problem_set.Arrays;

import java.util.Random;

public class Multiarray {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){
                M[i][j] =  random.nextInt(9);

            }
        }
        for (int[] line : M){
            for (int co : line){
                System.out.print(co + " ");

            }
            System.out.println();
        }
    }
}
