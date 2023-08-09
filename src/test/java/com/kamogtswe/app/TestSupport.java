package com.kamogtswe.app;

import com.kamogtswe.app.hands.Hand;
import com.kamogtswe.app.hands.Paper;
import com.kamogtswe.app.hands.Rock;
import com.kamogtswe.app.hands.Scissors;

import java.util.List;
import java.util.Random;

public class TestSupport {

    private static final List<Hand> allHands = List.of(new Rock(), new Paper(), new Scissors());

    protected static Hand giveAnyRandomHand() {
        return allHands.get(new Random().nextInt(allHands.size()));
    }

    protected static Hand giveAnyLosingHandComparedTo(Hand hand) {
        return allHands.stream().filter(h -> h.compareTo(hand) < 0).findAny().get();
    }

    protected static Hand giveAnyWinningHandComparedTo(Hand hand) {
        return allHands.stream().filter(h -> h.compareTo(hand) > 0).findAny().get();
    }

    protected static Game giveNewGameWithPlayers(int playerCount) {
        Game game = new Game();
        for (int i = 0; i < playerCount; i++) {
            addNewPlayerTo(game);
        }

        return game;
    }

    protected static Player addNewPlayerTo(Game game) {
        Player player = new Player();
        player.join(game);
        return player;
    }

}
