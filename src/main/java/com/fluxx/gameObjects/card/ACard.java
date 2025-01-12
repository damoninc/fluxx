package com.fluxx.gameObjects.card;

import com.fluxx.gameObjects.card.enums.ActionEnum;
import com.fluxx.gameObjects.card.enums.TargetEnum;

public abstract class ACard {
    public String name;
    public String description;
    public Action action;
    public TargetEnum target;

    public abstract void play();

    public class Action {
        public ActionEnum actionType;
        public Integer amount;
    }
}
