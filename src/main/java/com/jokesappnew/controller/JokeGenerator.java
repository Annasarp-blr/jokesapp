package com.jokesappnew.controller;

import com.jokesappnew.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chuck-norris")
public class JokeGenerator {
    private final JokeService jokeService;

    public JokeGenerator(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/joke")
    public String addAJoke(Model model) {
        String str = jokeService.getMeJoke();
        System.out.println("The joke I got:" + str);
        model.addAttribute("joke", str);
        return "chucknorris";
    }

    public void test() {
        System.out.println(jokeService.getMeJoke());
    }
}
