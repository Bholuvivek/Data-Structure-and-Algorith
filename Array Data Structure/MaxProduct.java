public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {4, 64, 3, 53, 22, 76, 46, 43, 1, 43};
        // Creating cunstructor
        MaxProduct mn = new MaxProduct();
        String result = mn.maxProduct(arr);
        System.out.println(result);

    }

    // Creating Methods
    public String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProduct) {
                    maxProduct = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }
}
