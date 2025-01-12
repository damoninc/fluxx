package com.fluxx.gameObjects.card;

import com.fluxx.gameObjects.card.enums.CardTypeEnum;

public class CardFactory {

    public static ACard getCardType(CardTypeEnum cardType) {
        switch (cardType) {
            case ACTION:
                return new ActionCard();
            case RULE:
                return new RuleCard();
            case GOAL:
                return new GoalCard();
            default:
                throw new IllegalArgumentException("Unknown card type: " + cardType);
        }
    }

    public static ACard getCardType(String cardType) {
        try {
            CardTypeEnum type = CardTypeEnum.valueOf(cardType.toUpperCase());
            return getCardType(type);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid card type: " + cardType);
        }
    }
}
