package com.mn.service.impl;

import com.mn.entity.Actor;
import com.mn.service.ActorService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by FGJ on 2017/4/9.
 */
@Service
@Transactional
public class ActorServiceImpl implements ActorService {
    @Override
    public List<Actor> getActors() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor(1, "John1", 18));
        actors.add(new Actor(2, "John2", 16));
        actors.add(new Actor(3, "John3", 17));
        return actors;
    }
}
