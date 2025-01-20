package com.fluxx.lifecycle;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.fluxx.gameObjects.card.*;
import com.fluxx.gameObjects.player.Player;

public class GameState {
    private List<ACard> drawPile;
    private List<Player> players;
    private Player currentPlayer;

    public GameState(List<ACard> drawPile, List<Player> players) {
        this.drawPile = drawPile;
        this.players = players;
        this.startOfGameSetup();
    }

    public void shuffleDeck() {
        List<ACard> deck = this.getDrawPile();
        Random rand = new Random();

        // Fisher-Yates Shuffle (Knuth Shuffle)
        for (int i = deck.size() - 1; i > 0; i--) {
            // Pick a random index from 0 to i
            int j = rand.nextInt(i + 1);

            // Swap the elements at i and j
            Collections.swap(deck, i, j);
        }
    }

    public List<ACard> getDrawPile() {
        return this.drawPile;
    }

    private void startOfGameSetup() {
        this.shuffleDeck();
        this.setStartingPlayer(this.players);
        this.dealCards();
    }

    private void setStartingPlayer(List<Player> players) {
        Random rand = new Random();
        int i = rand.nextInt(players.size());
        this.currentPlayer = players.get(i);
    }

    private void dealCards() {
        for (int i = 0; i < 3; i++) {
            for (Player player : this.players) {
                ACard card = this.drawPile.remove(0);
                player.hand.add(card);
            }
        }
    }

}
