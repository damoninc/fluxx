package com.fluxx;

import com.google.gson.Gson;
import com.fluxx.gameObjects.card.*;
import com.fluxx.gameObjects.card.enums.ActionEnum;
import com.fluxx.gameObjects.card.enums.CardTypeEnum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ACard card = CardFactory.getCardType(CardTypeEnum.ACTION);
        System.out.println(card.getClass().getSimpleName());
    }
}