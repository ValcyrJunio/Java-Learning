import java.util.Random;

public class randomMatrixAnalysis {
    public static void main(String[] args) {
        int [][] matrixA = new int[10][10];

        Random ran = new Random();

        for (int i = 0; i < matrixA.length ; i++){
            for (int j = 0; j < matrixA[i].length ; j++){
                matrixA[i] [j] = ran.nextInt(100);
            }

        }
        int bigger = 0;
        int minor  = 100;
        for (int i = 0 ; i < matrixA[5].length ; i++){
            if (matrixA[5][i] > bigger ){
                bigger = matrixA[5][i];

            }else if (matrixA[5][i] < minor){
                minor = matrixA[5][i];
            }
        }
        int bigger7 = 0;
        int smaller7  = 100;

        for (int[] value : matrixA) {
            if (value[7] > bigger7) {
                bigger7 = value[7];
            } else if (value[7] < smaller7) {
                smaller7 = value[7];
            }
        }
        for (int[] ints : matrixA) {
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(" "+ ints[j] + " |" );
            }
            System.out.println();
        }
        System.out.printf("Line 5 --\n Bigger number = %d \n Smaller = %d \n", bigger, minor);

        System.out.printf("Column 7 --\n Bigger number = %d \n Smaller = %d \n", bigger7, smaller7);
    }
}
