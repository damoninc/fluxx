package com.fluxx.gameObjects.card;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class CardInterpereter implements JsonDeserializer<ACard> {

    @Override
    public ACard deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        JsonObject jsonObj = json.getAsJsonObject();
        String cardType = jsonObj.get("cardType").getAsString();

        ACard card = CardFactory.getCardType(cardType);
        return new Gson().fromJson(json, card.getClass());
    }

}
