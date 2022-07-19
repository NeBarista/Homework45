public class Main {
    public static void main(String[] args) {
        double[] array = arraysProduct(new int[] {5, 6, 7, 8, 9}, new int[] {10, 11, 12, 13, 14});
        for(double item:array) {
            System.out.println(item);
        }
        double[] failed = arraysProduct(new int[] {1, 3}, new int[] {5});
        failed = arraysProduct(new int[] {Integer.MAX_VALUE}, new int[] {2});
        for (double item: failed) {
            System.out.println(item);
        }
    }
    public static double[] arraysProduct(int[] array1, int[] array2) {
        double[] result;
        final int arrayLength = array1.length;
        if (arrayLength == array2.length) {
            result = new double[arrayLength];
            for (int a =0; a<arrayLength; a++) {
                result[a] = ((double) array1[a]) * array2[a];
            }
            } else {
                System.out.println("arrays are different size");
                result = new double[]{};
            }
            return result;
        }
}