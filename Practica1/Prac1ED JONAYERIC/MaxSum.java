public class MaxSum {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        maxSubsequenceSum(array);
    }


    public static void maxSubsequenceSum(int[] a) {
        int maxSum = a[0];
        int currentSum = a[0];
        int start = 0, end = 0, tempStart = 0;


        for (int i = 1; i < a.length; i++) {
            if (currentSum + a[i] < a[i]) {
                currentSum = a[i];
                tempStart = i;
            } else {
                currentSum += a[i];
            }


            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }


        System.out.println("Solución de O(n)");
        System.out.println("Máximo: " + maxSum);
        System.out.println("Inicio: índice " + start + " (valor " + a[start] + ")");
        System.out.println("Final: índice " + end + " (valor " + a[end] + ")");
        System.out.println("Número de iteraciones: " + a.length);
    }
}






