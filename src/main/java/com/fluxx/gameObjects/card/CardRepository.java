package com.fluxx.gameObjects.card;

import java.util.List;

public class CardRepository {
    private static CardRepository instance;

    public static CardRepository getInstance() {
        if (instance == null) {
            return new CardRepository();
        } else
            return instance;
    }

    public List<ACard> getCards() {
        return null;
    }
}
