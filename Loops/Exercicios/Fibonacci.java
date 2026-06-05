package com.aula17.loopFor.Exercicios;
public class Fibonacci {
    public static void main (String[] args){
        int limit = 500;
        int actual = 1;
        int next = 0;
        int previous = 0;
        while (previous <= limit){
            System.out.println(previous);
            next = previous + actual;
            previous = actual;
            actual = next;
        }
    }
}
