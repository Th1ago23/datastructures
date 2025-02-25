package org.example.exercises;

public class Palíndromo {
    private String word;


    public Palíndromo(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean verify(){
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        if (reverse.equals(word)){
            return true;
        }else{
            return false;
        }
    }

    public void status(){
        if(verify()){
            System.out.println(word + " é um palíndromo.");
        } else {
            System.out.println(word + " não é um palíndromo.");
        }
    }
}
