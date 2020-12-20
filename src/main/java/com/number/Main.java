package com.number;

import com.number.services.NumberService;
import com.number.services.impl.FibonacciService;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private final static NumberService numberService = new FibonacciService();
    public static void main(String[] args) {
        System.out.println("Enter any positive integer to calculate the value. Press any other key to end the program.");
        final Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            final int n = sc.nextInt();
            final BigInteger result;
            try{
                result = numberService.getValue(n);
                System.out.println("Value for " + n + " is equal: " + result + ". Enter the next number or any other key to end the program.");
            } catch(IllegalArgumentException ex){
                System.out.println("The argument cannot be negative. Enter the next number or any other key to end the program.");
            }
        }
    }
}
