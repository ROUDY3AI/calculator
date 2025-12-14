package com.rold.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DeplacementpersonnageTest {
    @Test
    void orientation_initial_au_nord() {
        Deplacementpersonnage p = new Deplacementpersonnage();
        assertThat(p.getorientation()).isEqualTo("NORD");
    }
}