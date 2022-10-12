package com.nico;
import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.*;
import java.util.stream.IntStream;
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
        IntStream.range(0, test.size()).forEach(number -> System.out.println("Case #" + (1+ number) + ":" + test.get(number)));
    }
}