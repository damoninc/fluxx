package com.fluxx.lifecycle;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.fluxx.gameObjects.player.Player;

public class GameRunner {

    public static void main(String[] args) {

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        List<Player> players = new ArrayList<Player>(Arrays.asList(player1, player2));

        FluxxLifecycle lifecycle = new FluxxLifecycle(players);

        while (!lifecycle.isGameOver) {
            lifecycle.start();
        }
    }
}
