//Anonymous array is create once and use once
public class AnonymousArray {
    public static void main(String[] args) {
        int []arr = {23,23,21,22,54};
        int sum = 0;
        for(int i:arr){
           sum = sum +  i;
        }
        System.out.println(sum);
    }
}
