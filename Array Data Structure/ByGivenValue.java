public class ByGivenValue {
    public static void main(String[] args) {
        //In we initialize the value in program so we can initialize
        // DataType VariableName = {Value of Array};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        // In this Given array 0 index value is 1 and 7 index vale is 7
        //Let's Access the array Value By index
        System.out.println("The Index Value 0 is - " + array[0]);
        System.out.println("The Index Value 1 is - " + array[1]);
        System.out.println("The Index Value 2 is - " + array[2]);
        System.out.println("The Index Value 3 is - " + array[3]);
        System.out.println("The Index Value 4 is - " + array[4]);
        System.out.println("The Index Value 5 is - " + array[5]);
        System.out.println("The Index Value 6 is - " + array[6]);
        System.out.println("The Index Value 7 is - " + array[7]);
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(" Print Array Using For Loop");

        //Also we can print array with the help of Loop like for loop and while Loop also
          for(int i = 0; i < array.length; i++) {
             System.out.println(array[i]);
         }

         // Here I am Going to Print Array Using While
        System.out.println("--------------------------------------------------------------");
        System.out.println("Using While Loop");
        int index = 0;
        while(index < array.length){
            System.out.println(array[index]);
            index++;
        }
    }

}