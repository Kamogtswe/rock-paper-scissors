package com.kamogtswe.app.results;

import com.kamogtswe.app.Game;
import com.kamogtswe.app.Player;

// TODO implement this class

public class WinLossResult extends GameResult{
    public WinLossResult(Game game){
        super(game);

    }

    @Override
    public String toString(){
        String something = "";
        if(game.getPlayer1WinStatus() && !game.getPlayer2WinStatus()){
            System.out.println("Player 1 wins");
            something = "Player 1 wins";
        } else if (game.getPlayer2WinStatus() && !game.getPlayer1WinStatus()){
            System.out.println("Player 2 wins");
            something = "Player 2 wins";
        }
        return something;
    }

}
