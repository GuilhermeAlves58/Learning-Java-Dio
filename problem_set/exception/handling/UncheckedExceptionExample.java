package problem_set.exception.handling;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int result = 0;

        try{
            System.out.println("Trying to divide by zero...");
            result = numbers[1] / 0;
            System.out.println("This line will not execute.");
        } catch (ArithmeticException e){
            System.out.println("An error occurred: "+ e.getMessage());
        } finally {
            System.out.println("Finally block: Always executes!");
        }
        System.out.println("Program continues normally...");
    }
}
