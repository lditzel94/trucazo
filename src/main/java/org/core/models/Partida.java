package org.core.models;

import java.util.List;
import java.util.Map;

public class Partida {
    private final short PUNTAJE_MAXIMO = 30;

    // TODO: Inicializar partida
    private List<Jugador> jugadores;

    // TODO: Inicializar anotador
    private Map<String, Short> anotador;

    // TODO: comenzar la ronda
    public void comenzar() {
        String jugador1 = jugadores.get( 0 ).getNombre();
        String jugador2 = jugadores.get( 1 ).getNombre();
        Short puntajeJugador1 = anotador.get( jugador1 );
        Short puntajeJugador2 = anotador.get( jugador2 );

        while ( puntajeJugador1 < PUNTAJE_MAXIMO && puntajeJugador2 < PUNTAJE_MAXIMO ) {
            Ronda ronda = new Ronda( jugadores );
        }
    }
}
