package oop.tasks.t5.recursion;

public class Recalculation {
   int recalc (int a, int b) {
       if (a == b) {
           return a;
       }

       if (a < b) {
           recalc(a + 1, b);
       } else {
           recalc(a - 1, b);
       }

       return a;
   }
}
