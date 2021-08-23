package arrays.temperature;

import java.util.Scanner;

public class AvgTemperatureCalcNoArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temperatures? ");
        int numDays = scanner.nextInt();
        int sum =0;

        for (int i=1; i<= numDays; i++){
            System.out.println("Day "+i+ "'s high temperature: ");
            int next = scanner.nextInt();
            sum +=next;
        }

        double avg= sum*1.0/numDays;
        System.out.println();
        System.out.println("Average Temp = "+  avg);
    }
}
