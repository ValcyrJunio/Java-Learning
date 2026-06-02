package com.aula17.loopFor;

public class LoopFor {
    public static void  main (String[] args){
        //Initialize the integer I here and check if "i" is less than or equal to five
        //It will keep running while Integer i is less than or equal 5
        for (int i = 0; i <= 5 ; i++){
            System.out.println(i);
            //The i integer is initialized only in this loop, so you can use the same variable name in other loops
        }
        for (int i = 0, j = 10; i < j ; i++, j--){
            System.out.println("i = "+ i);
            System.out.println("j = " + j);
        }
        //The integer can also be initialized outside the "For" loop and used inside
        int i = 0;
        for ( ;i < 10; i++){
            System.out.println("i = " + i);
        }

        //This is an infinite loop
        for ( ; ; ){

        }
    }
}
