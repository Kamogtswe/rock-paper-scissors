package com.kamogtswe.app;

import com.kamogtswe.app.hands.Hand;
import com.kamogtswe.app.hands.Paper;
import com.kamogtswe.app.hands.Rock;
import com.kamogtswe.app.hands.Scissors;
import com.kamogtswe.app.results.GameResult;
import com.kamogtswe.app.ui.UserInputPrompt;

public class GameRunner {

    public static void main(String[] args) {
        // start game
        System.out.println("~~~~~~~~~ Welcome to Rock Paper SCissors! ~~~~~~~~~");

        UserInputPrompt howManyPlayers = new UserInputPrompt("How many players for this game?");

        howManyPlayers.doPrompt();
        GameConfig config;
        try {
             config = new GameConfig(Integer.getInteger(howManyPlayers.value()));
        } catch (NullPointerException e){
            config = new GameConfig(2);
        }
        Game game = new Game(config);

        for (int i = 0; i < config.getMinimumPlayers(); i++) {
            Player newPlayer = new Player();
            newPlayer.join(game);

            UserInputPrompt chooseAHand = new UserInputPrompt("(Player " + i + ") Choose a hand [R]ock,[P]aper or [S]cissors:");
            chooseAHand.doPrompt();

            Hand hand;
            switch (chooseAHand.value()) {
                case "R":
                    newPlayer.choose(new Rock());
                case "P":
                    newPlayer.choose(new Paper());
                case "S":
                    newPlayer.choose(new Scissors());
                default:
                    throw new IllegalArgumentException("Must be one of: [R]ock,[P]aper or [S]cissors");
            }
        }

        UserInputPrompt resolveGame = new UserInputPrompt("All players have chosen. Press enter to resolve game result.");
        resolveGame.doPrompt();

        GameResult result = game.play();

        new UserInputPrompt(result.toString());
    }
}
