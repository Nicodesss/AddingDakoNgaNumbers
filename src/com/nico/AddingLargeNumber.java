/*
EDUARDO DOMINICO LLOSA
Midterm Exam Part II: Programming Problem 1
CC 13.1 B - DATA STRUCTURES AND ALGORITHMS
 */
package com.nico;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;
class AddingLargeNumbers{
    static BigInteger bigInteger,numberOne,numberTwo;
    public static void main(String[]args){
        add();
    }
    static void add(){
        Stack<BigInteger> stack = new Stack<>();
        Scanner read = new Scanner(System.in);
        String x,y;
        int testCase = read.nextInt();
        int n = 0;

        while (testCase > n){
            x = read.next();
            y = read.next();

            numberOne = new BigInteger(x);
            numberTwo = new BigInteger(y);
            stack.push(bigInteger = numberOne.add(numberTwo));
            n++;
        }
        for (int i = 0; i < testCase; i++) {
            System.out.println("Case #"+ (i+1) +": "+ stack.get(i));
        }
    }
}