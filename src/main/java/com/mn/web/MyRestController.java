package com.mn.web;

import com.mn.entity.Actor;
import com.mn.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * Created by FGJ on 2017/4/9.
 */
@Controller
public class MyRestController {

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("actors", actorService.getActors());
        return "site.home";
    }

    /**
     * Return all actors
     * @return
     */
    @RequestMapping(value = "/actors", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getUser() {
        List<Actor> actors = actorService.getActors();
        return new ModelAndView("site.actors", "actors", actors);
    }

    private ActorService actorService;

    @Autowired
    public void setActorService(ActorService actorService) {
        this.actorService = actorService;
    }
}
