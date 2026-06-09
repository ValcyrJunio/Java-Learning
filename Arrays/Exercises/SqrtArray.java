import java.util.Scanner;
import java.lang.Math;

public class SqrtArray {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int [] arrayA = new int[6];
        double[] arrayB = new double[6];

        for (int i = 0 ; i < arrayA.length ; i++){
            System.out.printf("Type the %dº value\n", i + 1);
            arrayA[i] = scan.nextInt();
        }
        for (int i = 0  ; i < arrayA.length ; i++){
            arrayB[i] = Math.sqrt(arrayA[i]);
            System.out.printf("%dº [%d , %.2f]\n", i + 1, arrayA[i], arrayB[i]);
        }


    }
}
