package com.ArraysAndVectors;

public class Arrays {
    public static void main(String[] args){
        //How to declare an Array
        double [] temperature = new double[365];
        temperature[0] = 32.5;
        temperature[1] = 33.6;
        temperature[2] = 31.7;
        temperature[3] = 22.5;
        temperature[4] = 40.5;
        temperature[5] = 22.5;

        //two ways to show the Array's values
        System.out.println("There is "+ temperature.length + " Different array's values \n and his values  is - ");
        for (int i = 0; i < temperature.length ; i++){
            System.out.println("Temperature of Day "+(i+1) + " Is "+ temperature[i]);
        }
        //to show only the values you can also use the way below

        for (double temp : temperature){
            System.out.println(temp);
        }
    }
}
