package com.number.services.impl;

import com.number.services.NumberService;
import java.math.BigInteger;
import java.util.stream.Stream;

public class FibonacciService implements NumberService {
    public BigInteger getValue(final int n) {
        System.out.println("test");
        if(n<0){
            throw new IllegalArgumentException("Input number should be positive.");
        }
        return Stream.iterate(new BigInteger[]{
                BigInteger.ZERO, BigInteger.ONE}, t -> new BigInteger[]{t[1], t[0].add(t[1])})
                .limit(n)
                .map(x -> x[1])
                .reduce((a, b) -> b).orElse(BigInteger.ZERO);
    }
}
