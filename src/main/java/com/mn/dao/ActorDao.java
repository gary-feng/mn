package com.mn.dao;

import com.mn.entity.Actor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by FGJ on 2017/4/11.
 */
public interface ActorDao extends CrudRepository<Actor, Integer> {

    List<Actor> findActorsByName(String name);

    @Query("from Actor t where id = 2")
    List<Actor> findAllActors();
}
