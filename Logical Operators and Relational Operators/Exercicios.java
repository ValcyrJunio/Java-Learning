package com.aula13.operadores;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Variables used for temperature conversions
        float celsius;
        float fahrenheit;

        // Stores the option selected by the user
        int opcode;

        System.out.println("""
                Choose an option:
                1 - Monthly Salary Calculator
                2 - Fahrenheit to Celsius
                3 - Celsius to Fahrenheit
                4 - Ideal Weight Calculator
                5 - INSS and Income Tax Calculator
                """);

        opcode = scan.nextInt();

        switch (opcode) {

            case 1:

                // Variables used to calculate monthly gross salary
                int hoursPerMonth;
                float hourlyRate;

                System.out.println("Hourly wage:");
                hourlyRate = scan.nextFloat();

                System.out.println("Hours worked per month:");
                hoursPerMonth = scan.nextInt();

                // Calculates and displays the monthly gross salary
                System.out.println(
                        "Monthly salary: " + (hoursPerMonth * hourlyRate));

                break;

            case 2:

                // Converts Fahrenheit to Celsius
                System.out.println("Enter temperature in Fahrenheit:");
                fahrenheit = scan.nextFloat();

                celsius = (5 * (fahrenheit - 32) / 9);

                System.out.println(
                        String.format("%.2f", celsius) + " °C");

                break;

            case 3:

                // Converts Celsius to Fahrenheit
                System.out.println("Enter temperature in Celsius:");
                celsius = scan.nextFloat();

                fahrenheit = ((celsius * 9) / 5) + 32;

                System.out.println(
                        String.format("%.2f", fahrenheit) + " °F");

                break;

            case 4:

                // Calculates ideal weight based on height and gender
                double idealWeight;
                float height;
                int gender;

                System.out.println("Enter 1 for Male and 2 for Female:");
                gender = scan.nextInt();

                if (gender == 1) {

                    System.out.println("Enter your height (meters):");
                    height = scan.nextFloat();

                    // Formula for male ideal weight
                    idealWeight = (72.7 * height) - 58;

                    System.out.println(
                            "Ideal weight: " +
                                    String.format("%.2f", idealWeight) + " kg");

                } else if (gender == 2) {

                    System.out.println("Enter your height (meters):");
                    height = scan.nextFloat();

                    // Formula for female ideal weight
                    idealWeight = (62.1 * height) - 44.7;

                    System.out.println(
                            "Ideal weight: " +
                                    String.format("%.2f", idealWeight) + " kg");

                } else {

                    System.out.println(
                            "Invalid option. Please enter 1 or 2.");
                }

                break;

            case 5:

                // Variables used for payroll calculations
                float hourlyEarnings;
                int monthlyHours;

                System.out.println("How much do you earn per hour?");
                hourlyEarnings = scan.nextFloat();

                System.out.println("How many hours do you work per month?");
                monthlyHours = scan.nextInt();

                // Calculates gross salary
                double grossSalary = hourlyEarnings * monthlyHours;

                // Income tax deduction (11%)
                double incomeTax = grossSalary * 0.11;

                // Social security contribution (8%)
                double socialSecurity = grossSalary * 0.08;

                // Calculates final salary after deductions
                double netSalary =
                        grossSalary - socialSecurity - incomeTax;

                System.out.println("""
                        
                        Payroll Details:
                        INSS: %.2f
                        Income Tax: %.2f
                        Net Salary: %.2f
                        """
                        .formatted(
                                socialSecurity,
                                incomeTax,
                                netSalary));

                break;

            default:

                // Handles invalid menu options
                System.out.println("Invalid option!");
        }
    }
}