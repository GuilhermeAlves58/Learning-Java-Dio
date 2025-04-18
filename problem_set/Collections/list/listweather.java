package problem_set.Collections.list;

import java.util.Scanner;

public class listweather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperature = new double[6];

        String[] months = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        for(int i = 0; i < 6; i++){
            System.out.println("Type the average heat "+ months[i] + ":");
            temperature[i] = scanner.nextDouble();
        }
        double sum = 0;
        for(double temp: temperature){
            sum += temp;
        }
        double average = sum / temperature.length;
        System.out.println("Average biannual " + average);
        System.out.println("Above average months: ");
        for (int z = 0; z < 6; z++) {
            if(temperature[z] < average){
                System.out.printf(months[z], temperature[z]);
            }
        }
        scanner.close();
    }
}
