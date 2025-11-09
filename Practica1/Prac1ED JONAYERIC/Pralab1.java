public class Pralab1 {
        public static void main(String[] args) {
            int[] array = {1,2,3,4,5,6,7,8,9};
            maxSubsequenceSum_cuadratic(array);
        }

        public static void maxSubsequenceSum_cuadratic(int[] a) {

            int maxSum = 0;
            int thisSum;
            int numIte = 0;
            int seqStart = 0;
            int seqEnd = 0;


            for (int i = 0; i < a.length; i++)
            {
                numIte++;
                thisSum = 0;
                for ( int j = i; j < a.length; j++)
                {
                    numIte++;
                    thisSum += a[j];
                    if(thisSum > maxSum)
                    {
                        maxSum = thisSum;
                        seqStart = i;
                        seqEnd = j;
                    }
                }
            }
            System.out.println("Solucion de orden cubico");
            System.out.println("Maximo: " + maxSum);
            System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
            System.out.println("Numero de iteraciones: " + numIte);
        }

        /*
        Solució cúbica
    public static void maxSubsequenceSum_cubic (int [] a){
    int maxSum = 0;
    int thisSum;
 int seqStart = 0;
 int seqEnd = 0;
 int numIte = 0;
 for (int i=0; i < a.length; i++){
 numIte += 1;
 for (int j=i; j < a.length; j++){
 numIte += 1;
 thisSum = 0;
 for (int k = i; k <= j; k++){
 numIte += 1;
 thisSum += a[k];
 }
 if (thisSum > maxSum){
 maxSum = thisSum;
 seqStart = i;
 seqEnd = j;
 }
 }
 }
 System.out.println("Solucion de orden cubico");
 System.out.println("Maximo: " + maxSum);
 System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
 System.out.println("Numero de iteraciones: " + numIte);
}
 */
    }
