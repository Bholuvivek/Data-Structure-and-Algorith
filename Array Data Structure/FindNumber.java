import java.util.*;
// In this program I am going to Search a number of an Array

public class FindNumber {
    public static void main(String[] args) {
        // Here I am creating a array
        FindNumber fn = new FindNumber();
        int[] array = {20,10,40,50,55,72,1,3,2};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number which you want to Find?");
        int target = in.nextInt();
        fn.linearSearch(array,target);
    }
        //Here I am Creating a method for searching
        // I am going to use Linear Search
        public static void linearSearch(int[] arr,int findValue){
            for (int i = 0; i < arr.length; i++){
                if(arr[i]== findValue){
                    System.out.println("Value at found on Index "+i);
                }
            }
        }
}
