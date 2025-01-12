package com.fluxx.gameObjects.card;

import com.fluxx.gameObjects.card.enums.ActionEnum;
import com.fluxx.gameObjects.card.enums.TargetEnum;

public class CardDTO {
    public String name;
    public String description;
    public Action action;
    public TargetEnum target;

    public class Action {
        public ActionEnum actionType;
        public Integer amount;
    }
}