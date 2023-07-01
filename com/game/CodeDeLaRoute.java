package com.game;

public class CodeDeLaRoute implements Quiz{
    public void quiz(String msg){
        System.out.println("ceci est un quizz" + msg);
    }
    public void win(String msg){
        System.out.println("Vous avez Gagné/Perdu !!" + msg);
    }
}

