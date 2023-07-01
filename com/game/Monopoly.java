package com.game;

public class Monopoly extends Jeu implements JeuSociete , Playable {
    int x = 7;

        public void players(String msg){
            System.out.println("Ce jeux se joue jusqu'à "+msg+" personnes");
        };

        public void win(String msg){
            System.out.println("Vous avez gagné " +msg);
        };

        public void lancerDes(int x){
            System.out.println("lancement de " + x + " des");
        };
}
