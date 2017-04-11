package com.mn.service.impl;

import com.mn.dao.ActorDao;
import com.mn.entity.Actor;
import com.mn.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
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
        List<Actor> actors = actorDao.findAllActors();
        return actors;
    }

    @Autowired
    private ActorDao actorDao;

}
