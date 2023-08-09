package com.kamogtswe.app.results;

import com.kamogtswe.app.Game;

// TODO implement this class

public class DrawResult extends GameResult{
    public DrawResult(Game game){
        super(game);

    }

    @Override
    public String toString(){


        return "Draw";
    }
}
