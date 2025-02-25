package org.example.exercises;

public class FizzBuzz {
    int number;

    public FizzBuzz(int number){
        this.number = number;
    }

    public void count(){
        for (int i = 0; i <= number; i++){
            if (i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
