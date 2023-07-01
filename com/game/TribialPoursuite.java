package com.game;

/**
 * TribialPoursuite
 */
public class TribialPoursuite extends Jeu implements Playable, JeuSociete, Quiz {
    int x = 3;

    public void quiz(String msg){
        System.out.println("ceci est un quizz " + msg);
    }
    public void players(String msg){
        System.out.println("vous pouvez jouer à :" + msg);
    }
    public void win(String msg){
        System.out.println("Vous avez gagné !"+msg);
    };

    public void lancerDes(int x){
        System.out.println("lancement de " + x + " des");
    }
}