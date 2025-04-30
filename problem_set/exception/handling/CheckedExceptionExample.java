package problem_set.exception.handling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void readfile() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("Example.txt"));
        String line = reader.readLine();
        System.out.println("First line: " + line);
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readfile();
        } catch (IOException e){
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
