package com.amk.amktest.api.models.deserializers;

import com.amk.amktest.api.models.ArtistsResult;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by Jones on 29/09/17.
 */

public class ArtistsDeserializer implements JsonDeserializer<ArtistsResult> {
    @Override
    public ArtistsResult deserialize(JsonElement json, Type typeOfT,
                                     JsonDeserializationContext context) throws JsonParseException {
        return new Gson().fromJson(json, ArtistsResult.class);

    }
}
