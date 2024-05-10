package com.workintech.s19d1.util;

import com.workintech.s19d1.dto.ActorResponse;
import com.workintech.s19d1.entity.Actor;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static List<ActorResponse> actorResponseConverter(List<Actor> allActors) {
        List<ActorResponse> actorResponseList = new ArrayList<>();

        for (Actor actor: allActors) {
            ActorResponse actorResponse = new ActorResponse(actor.getId(), actor.getFirstName(), actor.getLastName(), actor.getBirthDate(), actor.getMovies());
            actorResponseList.add(actorResponse);
        }
        return actorResponseList;

    }

    public static ActorResponse actorResponseConverter(Actor actor) {
        ActorResponse actorResponse = new ActorResponse(actor.getId(), actor.getFirstName(), actor.getLastName(), actor.getBirthDate(), actor.getMovies());
        return actorResponse;
    }
    public static ActorResponse actorCreateResponseConverter(Actor actor) {
        ActorResponse actorResponse = new ActorResponse(actor.getId(), actor.getFirstName(), actor.getLastName(), actor.getBirthDate(), null);
        return actorResponse;
    }
}
