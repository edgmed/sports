package com.mercadolibre.demow25.controller;

import com.mercadolibre.demow25.dao.Morse;
import org.springframework.web.bind.annotation.*;


public class MorseController {

    public String  convertMorse(Morse morse){
        morse.setTranslate("bbbbb");
        return morse.getTranslate();
    }
}
