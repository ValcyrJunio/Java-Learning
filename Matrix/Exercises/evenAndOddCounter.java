import java.util.Scanner;

public class evenAndOddCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        int [][] numbers = new int[3][3];

        for (int i = 0 ; i < numbers.length ; i++ ){
            for (int j = 0  ; j < numbers.length ; j++ ){
                System.out.printf("Type the value for the position [ %d , %d]",i ,j);
                numbers[i][j] = scan.nextInt();
            }
        }
        for (int i = 0 ; i < numbers.length ; i++){
            for (int j = 0 ; j < numbers.length ; j++){
                if (numbers[i][j] % 2 == 0){
                even++;
                }else {
                    odd++;
                }
            }
        }

        for (int[] ints : numbers){
            for (int j = 0 ; j < numbers.length ; j++){
                System.out.printf("[ %d ]",ints[j]);
            }
            System.out.println();
        }

        System.out.printf("You typed %d even numbers and %d odd numbers ",even ,odd);
    }
}
