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


 }