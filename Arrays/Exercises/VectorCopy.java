import java.util.Scanner;

public class VectorCopy {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the values to A vector");
        int[] vectorA = new int[6];
        int[] vectorB = new int[6];
        for (int i = 0; i < vectorA.length ; i++){
            System.out.println(i + "ª Element: ");
            vectorA[i] = scan.nextInt();
        }
        //Manual Array copy
        for (int i = 0; i < vectorA.length ; i++){
            vectorB[i] = vectorA[i];
        }
        //Result
        for (int i = 0; i < vectorB.length ; i++){
            System.out.printf("[A%d = %d]",i ,vectorA[i]);
            System.out.printf("[B%d = %d]\n",i ,vectorB[i]);
        }
    }
}
