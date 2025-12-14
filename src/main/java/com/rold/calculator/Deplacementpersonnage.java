package com.rold.calculator;

public class Deplacementpersonnage {
      private int orientation=0;
      public String getorientation()
      {
            return "NORD";
      }
      public String tourner (int fois)
      {
          orientation=(orientation + fois)%4;
          switch(orientation)
          {
              case 0:return "NORD";
              case 1:return "EST";
              case 2:return  "SUD";
              case 3:return  "OUEST";
              default:return "NORD";
          }

      }

}
