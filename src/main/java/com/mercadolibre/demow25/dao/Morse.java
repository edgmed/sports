package com.mercadolibre.demow25.dao;

import lombok.Data;
import lombok.NonNull;

@Data
public class Morse {
    @NonNull
    private String morse;
    private String translate;
}
