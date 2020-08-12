package com.jokesappnew.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("JokeService")
public class JokeServiceImpl implements  JokeService {

    @Autowired
    @Qualifier(value="ChuckNorrisQuotes")
    ChuckNorrisQuotes chuckNorrisQuotes;

    public  JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }



    public JokeServiceImpl() {

    }

    @Override
    public String getMeJoke() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
