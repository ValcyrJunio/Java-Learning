package com.aula17.loopFor.Exercicios;
import java.util.Scanner;

public class LoginLogic {
    public void main (String[] args){
        //Initialize the scan
        Scanner Scan = new Scanner(System.in);

        //Here it'll initialize the Characters and ask for the first login and password
        System.out.println("Create your Login");
        char login = Scan.next().charAt(0);
        System.out.println("Create a PassWord");
        char password = Scan.next().charAt(0);

        //if login equal password it'll start the loop
        while (login == password){
            System.out.println("You cant set your password as same as you login, try again");
            System.out.println("Create your Login");
            login = Scan.next().charAt(0);
            System.out.println("Create a PassWord");
            password = Scan.next().charAt(0);
        }
        //if the login and the password isn't the same, it'll show the message below
        System.out.println("Login Sucefully created!");
    }
}
