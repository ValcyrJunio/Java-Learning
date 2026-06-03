import java.util.Scanner;

public class Factorial {
    public static void  main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a number and know his factorial");
        int number = scan.nextInt();

        //Use long because factorial grows fast and can exceed the int limit.
        long result = 1;

        //factorial logic
        for (int i = 1; i <= number ; i++){
            result = result * i;
        }

        System.out.printf("The factorial for %d is %d", number, result );
    }
}
