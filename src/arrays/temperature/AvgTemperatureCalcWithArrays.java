package arrays.temperature;

import java.util.Arrays;
import java.util.Scanner;

public class AvgTemperatureCalcWithArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temperatures? ");
        int numDays = scanner.nextInt();
        int[] temps = new int[numDays];
        //record temps and find the average
        int sum = 0;

        for (int i = 0; i < numDays; i++) {
            System.out.println("Day " + (i + 1 )+ "'s high temperature: ");
            temps[i] = scanner.nextInt();
            sum += temps[i];
        }

        double avg = sum * 1.0 / numDays;

        //count days about temperature
        int count= 0;

        for (int i=0; i< temps.length; i++){
            if (temps[i] > avg){
                count++;
            }
        }


        System.out.println();
        System.out.println("Average Temp = " + avg);

        if (count == 0) {
            System.out.println("No day was above the the Average");
        } else {
            System.out.println(count + " days were above the the average");
        }
    }
}
