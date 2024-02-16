

import java.util.Scanner;

public class ArrayBasicProject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" How many Days ' Temperatures?");
        int numDays = in.nextInt();
        int[] temps = new int[numDays];
        // Records Temperatures and find average
        int sum = 0;
        for (int i = 0; i<numDays; i++){
            System.out.println("Days "+(i+1)+"'s high Temp: ");
            temps[i] = in.nextInt();
            sum +=temps[i];
        }

        double average = sum / numDays;
        /* Count days above average */
        int above = 0;
        for (int i = 0; i<temps.length; i++){
            if(temps[i] > average){
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = "+average);
        System.out.println(above+" days above average");
    }

}
