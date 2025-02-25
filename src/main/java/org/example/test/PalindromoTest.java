package org.example.test;

import org.example.exercises.Palíndromo;

public class PalindromoTest {
    public static void main(String[] args) {
        Palíndromo p = new Palíndromo("arara");
        p.setWord("Jacaré");
        p.verify();
        p.status();
    }

}
