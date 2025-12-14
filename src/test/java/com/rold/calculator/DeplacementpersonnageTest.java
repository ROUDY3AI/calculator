package com.rold.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DeplacementpersonnageTest {

    Deplacementpersonnage p = new Deplacementpersonnage();
    @Test
    void orientation_initial_au_nord() {
        assertThat(p.getorientation()).isEqualTo("NORD");
    }
    @Test
    void tourner_une_fois_vers_EST()
    {
       assertThat(p.tourner(1)).isEqualTo("EST");
    }
}