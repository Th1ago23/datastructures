package org.example.test;

public class RecursiveTest {
    int max;

    public RecursiveTest(int max) {
        this.max = max;
    }

    public int countDown(int max){
        if (max >= 10) {
        return max;
        }
        return countDown(max + 1);
    }

    public static void main(String[] args) {
        RecursiveTest n = new RecursiveTest(0);
        System.out.println(n.countDown(0));

    }
}
