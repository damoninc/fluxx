package com.fluxx.gameObjects.player;

import java.util.ArrayList;
import java.util.List;
import com.fluxx.gameObjects.card.ACard;

public class Player {
    public List<ACard> hand = new ArrayList<ACard>();
    public String name;

    public Player(String name) {
        this.name = name;
    }
}
