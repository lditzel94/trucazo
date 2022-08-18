package org.core;

import lombok.Data;

import java.util.List;

@Data
public class Jugador {
    private String nombre;
    private List<Carta> cartas;
    private boolean isMano;

    public void tirar( Carta carta, Jugada jugada ) {

    }

    public void envido( Carta primera, Carta segunda ) {

    }
}
