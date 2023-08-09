package com.kamogtswe.app;

import com.kamogtswe.app.hands.Hand;
import com.kamogtswe.app.hands.Rock;

import java.util.List;
import java.util.stream.Collectors;

public class Player {
    private Game currentGame;
    private Hand hand;
    private int wins = 0;

    public void join(Game game) {
        // TODO implement this
        this.currentGame = game;
        this.currentGame.addPlayers(this);
    }

    public void choose(Hand hand) {
        // TODO implement this
        this.hand = hand;
    }

    public List<Player> opponents() {
        // TODO implement this
        return currentGame.getPlayers();
    }

    public Hand getHand(){
        return this.hand;
    }

    public int getWins() {
        return this.wins;
    }

    public void addWin() {
        wins = wins + 1;
    }
}