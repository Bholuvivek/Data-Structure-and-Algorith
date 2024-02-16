// Creating class  || This is Program for 1D Arrays
import java.util.*;
public class FirstArray {
    // Main Method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.print("Enter the Array! ");
            array[i] = in.nextInt();

        }
        for (int j = 0; j <array.length; j++){
            System.out.print(array[j]+", ");
        }
    }
}

