
//Array : Array is a data structure which is store the Same type variable or Data
// Array is use for Code Optimization
// Array is Store the Limited Size of Data
// Arraya is Two Types :
//      1. Single Dimention Array
//      2. Multi Dimention Array


// In This Program I am Going to Tell About How to Create An Array
// Creating an Array we have to follow this :
//  DataType[] variablname = new Datatype[size of Array];
// or DataType [] VariableName = new DataType[size of Array];
// or DataType VariableName[] = new DataType[size of Array];
// Array is Start from 0 index
public class Main {
    public static void main(String[] args) {
        int[] arry = new int[6];
        arry[0] = 1;
        arry[1] = 2;
        arry[2] = 3;
        arry[3] = 4;
        arry[4] = 5;
        arry[5] = 6;
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+", ");
            // The array will print
        }
    }
}