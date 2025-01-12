package com.fluxx.lifecycle;

import java.util.List;

import com.fluxx.gameObjects.player.Player;

public class FluxxLifecycle {
    public boolean isGameOver = false;
    public List<Player> players;

    public FluxxLifecycle(List<Player> players) {
        this.players = players;
    }

    public void start() {

    }

    public void drawCard() {

    }

    public void playCard() {

    }

    public Player getNextPlayer() {
        return null;
    }

    public void determineWinner() {

    }

    public List<Player> getPlayers() {
        return this.players;
    }
}
