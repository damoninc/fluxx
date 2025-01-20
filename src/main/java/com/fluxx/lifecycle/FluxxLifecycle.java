package com.fluxx.lifecycle;

import java.util.List;

import com.fluxx.gameObjects.player.Player;

public class FluxxLifecycle {
    public boolean isGameOver = false;
    private boolean didDrawCards = false;
    private boolean didPlayCards = false;
    private Player player;

    public FluxxLifecycle(Player player, GameState state) {
        this.player = player;
    }

    public void start() {

    }

    public void drawCards() {
        if (this.didDrawCards) {
            System.out.println("You may not draw cards, you already have drawn once your turn.");
            return;
        }

        this.didDrawCards = true;
    }

    public void playCard() {
        if (this.didPlayCards) {
            System.out.println("You may not play cards, you already have played once your turn.");
            return;
        }
        this.didPlayCards = true;
    }

    public void determineWinner() {

    }

}
