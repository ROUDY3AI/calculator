package com.rold.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org .junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


 class FizzbuzzTest {
 @Test
    void Fizzbuzz_de_un_a_un()
    {
        assertThat(Fizzbuzz.de(1)).isEqualTo("1");
    }
    @Test
    void Fizzbuzz_de_deux_a_deux()
    {
        assertThat(Fizzbuzz.de(2)).isEqualTo("2");
    }
    @Test
    void Fizzbuzz_de_trois_a_trois()
    {
        assertThat(Fizzbuzz.de(3)).isEqualTo("Fizz");
    }
    @Test
    void Fizzbuzz_de_buzz_a_buzz()
    {
        assertThat(Fizzbuzz.de(5)).isEqualTo("Buzz");
    }
    @Test
    void Fizzbuzz_de_fizbuzz_a_fizzbuzz()
    {
        assertThat(Fizzbuzz.de(15)).isEqualTo("FizzBuzz");
    }


 }