package com.scaler.naveen.contollers;

import com.scaler.naveen.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokesController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping("/joke")
    public String getRandomJoke() {
        return jokeService.getRandomJoke();
    }
}
