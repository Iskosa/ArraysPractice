public class Arrays {

    public static void main(String[] args) {
        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;
        float total = 0.0f;
        for (int i = 0; i < theVals.length; i++) {
            total = total + theVals[i];
        }
        System.out.println(total);
        int[] x = {23, 4, 6, 90};
        System.out.println(findMax(x));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}