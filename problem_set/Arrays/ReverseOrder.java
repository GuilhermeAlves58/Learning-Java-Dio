package problem_set.Arrays;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] array = {0,5,10,50,123};

        int count = array.length - 1;

        while(count != 0){
            System.out.println(array[count]);
            count--;
        }

    }
}
