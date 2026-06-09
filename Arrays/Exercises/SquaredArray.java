import java.sql.Array;
import java.util.Scanner;

public class SquaredArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arrayA = new int[6];
        int [] arrayB = new int[6];

        for (int i = 0 ; i < arrayA.length ; i++){
            System.out.printf("Type the %dº value to be squared \n", i + 1);
            arrayA[i] = scan.nextInt();
        }
        for (int i = 0 ; i < arrayA.length ; i++){
            arrayB[i] = arrayA[i] * arrayA[i];
            System.out.printf("%dº [%d , %d]\n", i + 1, arrayA[i], arrayB[i]);
        }
    scan.close();
    }
}
