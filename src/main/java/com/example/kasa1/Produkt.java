package com.example.kasa1;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Produkt {
    private final String nazwa;
    private final Double cena;
}
