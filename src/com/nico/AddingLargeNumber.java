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
    static BigInteger x,y;
    static Stack<BigInteger> cases = new Stack<>();
    public static void main(String[]args){
        add(cases,x,y);}
    static void add(Stack print, BigInteger firstNum, BigInteger secondNum){
        Scanner read = new Scanner(System.in);
        String x,y;
        int testCase = read.nextInt();
        int n = 0;
        while (testCase > n){
            x = read.next();
            y = read.next();
            firstNum = new BigInteger(x);
            secondNum = new BigInteger(y);
            print.add(firstNum.add(secondNum));
            n++;
        }
            for (int i = 0; i < testCase; i++) {
            System.out.println("Case #"+ (i+1) +": "+ print.get(i));
        }
    }
}