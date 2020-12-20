package com.number.services;

import com.number.services.impl.FibonacciService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class FibonacciServiceTest {

    private static final NumberService fibonacciService = new FibonacciService();

    @Test
    public void testIfIllegalArgumentExceptionWasThrownForNegativeInputNumber(){
        // given
        final int inputValue = -1;

        // when & then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fibonacciService.getValue(inputValue);
        });
    }

    @Test
    public void testIfZeroWasReturnedForZeroInputNumber(){
        // given
        final int inputValue = 0;

        // when
        final BigInteger computedValue = fibonacciService.getValue(inputValue);

        // then
        Assertions.assertEquals(BigInteger.valueOf(0), computedValue);
    }

    @Test
    public void testValueForSmallInputNumber(){
        // given
        final int inputValue = 6;

        // when
        final BigInteger computedValue = fibonacciService.getValue(inputValue);

        // then
        Assertions.assertEquals(BigInteger.valueOf(8), computedValue);
    }

    @Test
    public void testValueForMediumInputNumber(){
        // given
        final int inputValue = 50;

        // when
        final BigInteger computedValue = fibonacciService.getValue(inputValue);

        // then
        Assertions.assertEquals(BigInteger.valueOf(12586269025L), computedValue);
    }

    @Test
    public void testValueForBigInputNumber(){
        // given
        final int inputValue = 250;

        // when
        final BigInteger computedValue = fibonacciService.getValue(inputValue);

        // then
        Assertions.assertEquals(new BigInteger("7896325826131730509282738943634332893686268675876375"), computedValue);
    }
}
