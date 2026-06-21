import java.util.Random;

public class randomMatrix {
    public  static void main(String[] args) {

        int [][] randomNumbers = new int[4][4];

        Random ran = new Random();

        for (int i = 0; i < randomNumbers.length ; i++){
            for (int j = 0; j < randomNumbers[i].length ; j++){
                randomNumbers[i] [j] = ran.nextInt(100);
            }
        }
        int line = 0;
        int column = 0;
        int bigger = 0;

        for (int i = 0 ; i < randomNumbers.length ; i++){
            for (int j = 0 ; j < randomNumbers[i].length ; j++){
                if (randomNumbers [i] [j] > bigger){
                    bigger = randomNumbers[i] [j];
                    column = i;
                    line   = j;
                }
            }
        }
        for (int i = 0 ; i < randomNumbers.length ; i++){
            for (int j = 0 ; j < randomNumbers.length; j++){
                System.out.print(randomNumbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.printf("Bigger number: %d\n column: %d\n line: %d ", bigger, column, line);
    }
}
