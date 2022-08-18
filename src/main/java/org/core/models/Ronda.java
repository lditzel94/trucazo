package org.core.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ronda {

    private List<Jugador> jugadores;
    private Map<String, Short> puntosAcumuladosByJugador;

    public Ronda( List<Jugador> jugadores ) {
        this.jugadores = jugadores;
        this.puntosAcumuladosByJugador = new HashMap<>();
    }

    // TODO: repartir cartas, designar quien es mano de manera aleatoria
    public void comenzar() {

    }

    // TODO: asignar el listado de cartas a los jugadores
    public void repartir() {

    }

    //TODO: sumar los puntos acumulados de la ronda al puntaje total de la partida
    public void finalizar() {

    }


    // TODO: inicializar mazo
    static {

    }


}
