//In this Program I am Going to Find The Minimum Value Of Any Array
public class MinimumValue {
    public static void main(String[] args) {
        int [] array = {656,4,545,5,1,10,55,648,0,6};
        int minimum = minValue(array);
        System.out.println("Minimum Value is "+minimum);
    }
    static int minValue(int[] arr) {
        int min;
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min >= arr[i]) {
                int temp = arr[i];
                min = temp;
            }
        }
        return min;
    }


}
