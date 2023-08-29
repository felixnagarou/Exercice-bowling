package org.example.bowling;

import java.util.HashMap;
import java.util.List;

public class Frame {

    private int frameNumber;
    private int numberOfKeelHit; //todo Mockito pour générer un coup aléatoire
    private int keelNumber;
    private HashMap<Player, Integer> scoreList = new HashMap<>();



    public Frame(){}

    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public int getNumberOfKeelHit() {
        return numberOfKeelHit;
    }

    public void setNumberOfKeelHit(int numberOfKeelHit) {
        this.numberOfKeelHit = numberOfKeelHit;
    }

    public int getKeelNumber() {
        return keelNumber;
    }

    public void setKeelNumber(int keelNumber) {
        this.keelNumber = keelNumber;
    }

    public HashMap<Player, Integer> getScoreList() {
        return scoreList;
    }

    public void setScoreList(HashMap<Player, Integer> scoreList) {
        this.scoreList = scoreList;
    }
}
