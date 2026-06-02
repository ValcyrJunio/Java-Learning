package com.aula17.loopFor.Exercicios;
import java.util.Scanner;


public class AvaliationProgram {
    public void main (String[] args){

        //Initialize the Scanne
        Scanner Scan = new Scanner(System.in);

        //initialize and ask the user to type a valid score
        System.out.println("Type a score 0 to 10 for our service ");
        int avaliation = Scan.nextInt();

        //While loop, it will keep running until the user type a valid score
        while (avaliation < 0 || avaliation > 10 ){
            System.out.println("Type a valid score to continue");
            avaliation = Scan.nextInt();
        }

        //If the user put a valid score it will show a different feedback if he's happy or not
        if (avaliation <=4){
            System.out.println("Sorry for the inconvenience ;c");
        } else {
            System.out.println("Thanks!");
        }
        //Closing the scan (good practices)
        Scan.close();
    }
}
