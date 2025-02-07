package org.example;

import org.example.introduce.BinarySearch;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);

        BinarySearch bs = new BinarySearch(ints);

        int result = bs.binaryS(5);
        System.out.println("Índice do número 5: " + result);
    }
}