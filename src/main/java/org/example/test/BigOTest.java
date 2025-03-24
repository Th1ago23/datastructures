package org.example.test;

import org.example.exercises.BigO;

public class BigOTest {
    public static void main(String[] args) {
        BigO bigO = new BigO(20);

        /*for (int i = 0;i < bigO.getTarget();i++){
            System.out.println(i);
        }*/
        // Este simples loop é O(n)

        /*for (int i = 0; i < bigO.getTarget();i++){
            for (int j = i+1; j < bigO.getTarget();j++){
                System.out.println(j);
            }
            System.out.println(i);
        }*/
        // Aqui é O(n²)

        while (bigO.getTarget() < 1){
            System.out.println(bigO.getTarget()/2);
        }
        // Aqui é O(log n)
    }
}
