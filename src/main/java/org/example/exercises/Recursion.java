package org.example.exercises;

public class Recursion {
    private int number;



    public Recursion(int number){
        this.number = number;
    }

    public void returnUntilOne (int number){
        if (number <= 1){
            System.out.println("1");
            return;
        }
            System.out.println(number);
            returnUntilOne(number / 2);
        }

    public void returnUntilN (int number, int target){
        if (target == number){
            System.out.println(1);
            return;
        }
        System.out.println("O target é: "+target + " Contagem atual: " + number);
        returnUntilN(number, target + 1);
    }

    public int fatorialN(int number){
        if (number == 1 ){
            return 1;
        }

        return number + fatorialN(number*(number - 1));
        }
    }



