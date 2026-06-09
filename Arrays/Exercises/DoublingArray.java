import java.util.Scanner;
public class DoublingArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int [] ArrayA = new int[6];
        int [] ArrayB = new int[6];

        for (int i = 0; i < ArrayA.length ; i++){
            System.out.printf("Type the %dº value\n", i + 1);
            ArrayA[i] = scan.nextInt();
        }
        for (int i = 0; i<ArrayA.length ; i++){
            ArrayB[i] = ArrayA[i] * 2;
            System.out.printf("%dº [ A = %d,B = %d]\n",i + 1, ArrayA[i], ArrayB[i]);
        }
        scan.close();
    }
}
