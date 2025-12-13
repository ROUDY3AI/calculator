package com.rold.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class DeplacementpersonnageTest {
   @Test
    void orientation_initial_au_nord()
   {
       Deplacementpersonnage p = new Deplacementpersonnage();
       asserThat(p.getorientation()).isEqualTo("NORD");
   }

}