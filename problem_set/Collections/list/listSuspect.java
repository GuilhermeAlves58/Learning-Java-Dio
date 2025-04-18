package problem_set.Collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class listSuspect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> answers =  new ArrayList<>();
        String[] questions = {
                "Called the victim?",
                "Have been in the crime scene?",
                "Lives near the victim?",
                "Owes the victim?",
                "worked for the victim?"
        };
        System.out.println("Answer with 'Yes' or 'No':");

        for(String question : questions){
            System.out.println(question + " ");
            String answer = scanner.nextLine().trim().toLowerCase();
            answers.add(answer);
        }
        int positivecont = 0;
        for(String answer: answers){
            if(answer.equals("yes")){
                positivecont++;
            }
        }

        String Classification;
        if (positivecont == 2) {
            Classification = "Suspect";
        } else if (positivecont >= 3 && positivecont <= 4) {
            Classification = "Accomplice";
        } else if (positivecont == 5) {
            Classification = "Murder";
        } else {
            Classification = "Innocent";
        }

        System.out.println("\nClassification: " + Classification);

        scanner.close();
    }
}
