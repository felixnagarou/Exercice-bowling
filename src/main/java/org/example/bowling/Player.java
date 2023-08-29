package org.example.bowling;

import java.util.HashMap;

public class Player {

    private int id;
    private String pseudo;
    private int score;
    private int numberOfKeelHit;

    private int numberOfThrowsLeft;



    public int lancer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumberOfKeelHit() {
        return numberOfKeelHit;
    }

    public void setNumberOfKeelHit(int numberOfKeelHit) {
        this.numberOfKeelHit = numberOfKeelHit;
    }

    public int getNumberOfThrowsLeft() {
        return numberOfThrowsLeft;
    }

    public void setNumberOfThrowsLeft(int numberOfThrowsLeft) {
        this.numberOfThrowsLeft = numberOfThrowsLeft;
    }
}
