import java.util.Scanner;
public class Fibonacci {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want the Fibonacci sequence up to which number?");
        int limit = 500;
        int actual = 1;
        int next = 0;
        int previous = 0;
        System.out.println(previous);
        while (previous > limit){
            System.out.println(previous);
            next = previous + actual;
            previous = actual;
            actual = next;
        }
    }
}
