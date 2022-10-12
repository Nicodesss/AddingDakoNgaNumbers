package com.nico;
import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.*;
class AddingLargeNumbers {
    public static void main(String[] args) {
        ArrayList<BigInteger> test = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        BiFunction<BigInteger, BigInteger, BigInteger> adds = BigInteger::add;
        int nCases = read.nextInt();
        while(nCases > 0){
            test.add(adds.apply(read.nextBigInteger(), read.nextBigInteger()));
            nCases--;
        }
        for (int i = 0; i < test.size(); i++) {
            System.out.println("Case #"+ (i+1) + ": "+ test.get(i));
        }
    }
}