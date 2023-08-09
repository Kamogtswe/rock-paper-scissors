package com.kamogtswe.app.results;

import com.kamogtswe.app.Game;
import com.kamogtswe.app.Player;

import java.util.List;

// TODO implement this class

public class GameResult {
    protected Game game;

    public GameResult(Game game){
        this.game = game;
    }

    public List<Player> players(){
        return this.game.getPlayers();
    }
}
