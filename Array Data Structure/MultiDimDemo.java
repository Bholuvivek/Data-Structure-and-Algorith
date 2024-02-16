public class MultiDimDemo {
    public static void main(String[] args) {
        int[] oneDarray = {1,2,3,4,5};
         oneDim(oneDarray);
//        int[][] twoDarr = {{1,2,3},{1,2,3,4}};
//        twoDim(twoDarr);
//        int[][][] threeDarra = {{{9,2,3},{1,2,3,4},{1,2,3,4,5}}};
//        threeDim(threeDarra);
//        int[][][][] fourDarray = {{{{1,2,3,4},{1,2,3,4,5},{1,2,3,4,5,6},{1,2,3,4,5,6,7}}}};
//        fourDim(fourDarray);
//        int[][][][][] fiveDarray = {{{{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}}}}};
//        fiveDim(fiveDarray);
//        int[][][][][][] sixDarray = {{{{{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30,31},{32,33,34,35,36,37}}}}}};
//        sixDim(sixDarray);

    }
    static void oneDim(int[] arr){
        System.out.println("This is One Dimension Array ----------------------");
        System.out.println();
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void twoDim(int[][] arr){
        System.out.println("This is Two Dimension Array -------------------------------------------------");
        System.out.println();
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void threeDim(int[][][] arr){
        System.out.println("This is Three Dimension Array---------------------------------------");
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                for (int k = 0; k < arr[i][j].length; k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
    static void fourDim(int[][][][] arr){
        System.out.println("This is Four Dimension Array-----------------------------------------");
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                for (int k = 0; k < arr[i][j].length; k++){
                    for (int l = 0; l < arr[i][j][k].length; l++){
                        System.out.print(arr[i][j][k][l]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    static void fiveDim(int[][][][][] arr){
        System.out.println("This is Five Dimension Array --------------------------------------------------");
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[i].length; j++){
                for (int k = 0; k < arr[i][j].length; k++){
                    for (int l = 0; l < arr[i][j][k].length; l++){
                        for (int m = 0; m < arr[i][j][k][l].length; m++){
                            System.out.print(arr[i][j][k][l][m]+" ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
    static void sixDim(int[][][][][][] arr){
        System.out.println("This is Six Dimension --------------------------------------------------------------");
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[i].length; j++){
                for (int k = 0; k < arr[i][j].length; k++){
                    for (int l = 0; l < arr[i][j][k].length; l++){
                        for (int m = 0; m < arr[i][j][k][l].length; m++){
                            for (int n = 0; n <arr[i][j][k][l][m].length; n++){
                                System.out.print(arr[i][j][k][l][m][n]+" ");
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
