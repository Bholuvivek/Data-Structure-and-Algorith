// In this Progam I am Going to Pass The Array Using Method
// Advantage of Using Method
//      -Code Reuse
//      -Better Coding
public class PassingArrayUsingMethod {
    //This is Our Main Method
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        passingArrayUsing(arr);
    }
    // Here I am Going to Create Method
    static int[] passingArrayUsing(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        return array;
    }

}
