import java.util.Scanner;

public class NumberComparison {
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you want to compare?");
        int n = scan.nextInt();
        int smaller = 0;
        int bigger = 0;
        int sum = 0;

        if (n <= 0 ){
            System.out.println("Type a valid number ");
            return;


        }else {
            for ( int i = 1; i<=n ;i++){
                System.out.println("Type the " + i +"º Number");
                int number = scan.nextInt();
                if (i == 1){
                    smaller = number;
                    bigger = number;
                }else {
                    if (number > bigger ){
                        bigger = number;
                    } else if (number < smaller){
                        smaller = number;
                    }

                }
             sum = sum + number;
            }

        }
        System.out.println("The bigger number is " + bigger);
        System.out.println("The smaller number is " + smaller);
        System.out.println("The some of all numbers is "+sum);
    }
}
