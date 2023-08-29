package org.example.bowling;

import java.util.List;

public class Game {
    private List<Player> playerList;
    private List<Frame> frameList;

    public Game(){
    }

    public Game(List<Player> playerList){
        this.playerList = playerList;
    }

}
