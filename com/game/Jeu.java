package com.game;

public abstract class  Jeu{   
    public abstract void lancerDes(int des);
    public void game(String msg){
        System.out.println("Ceci est un jeu " +msg);
    };
}