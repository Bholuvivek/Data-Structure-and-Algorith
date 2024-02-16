// In this program we  will check that the  given array is unique or not
public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,60,10};
        // Creating Constructor
        FindUniqueNumber fnq = new FindUniqueNumber();
        boolean result = fnq.isUnique(array);
        System.out.println(result);
    }
    // Creating Method for finding the unique no.
    public boolean isUnique(int[] array){
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i+1; j < array.length; j++){
                if(array[i] == array[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
