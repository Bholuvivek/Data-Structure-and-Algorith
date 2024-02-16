//This is Bubble Short Program which is use for shorting the Array
// In bubble Shor we take an Array
// For Example array = 36,19,29,12,,5
// round 1:
// 36 will compare with 19 and it take place of 19  if 36 is larger than  19
// again compare with next element if 36 is  greater than next element then it will take place ...

public class BubbleShort {
    public static void main(String[] args) {
        int[] array = {36, 19, 29, 12, 8, 5};
        acendingShort(array);
        decengingShort(array);
    }

  static void acendingShort(int[] arr) {
      System.out.println();
      System.out.println("Accending Order -----------------------");
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {  // for string we can give condition if(int[j].compareTo(arr[j+1])>0)
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


  static void decengingShort(int[] arr){
      System.out.println();
      System.out.println("Decending order---------");
        int temp;
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j+1]) {  // for string we can give condition if(int[j].compareTo(arr[j+1])>0)
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]);
            }
    }

}

