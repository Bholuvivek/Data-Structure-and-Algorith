public class Palidrome{
  public static void main(String[] args){
    String str = "madam";
    System.out.println(isPalidrome(str));
}
public static boolean isPalidrome(String Str){
		char[] charArr = str.toCharArray();
		int str = 0;
		int end = charArr.length()-1;
		while(start<end){
			if(charArr[start] != charArr[end]){
					return false;
			}
			start++;
			end--;
		}
	return true;
  }
}
