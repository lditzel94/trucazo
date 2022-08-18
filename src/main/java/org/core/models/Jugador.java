package org.core.models;

import lombok.Data;
import org.core.enums.Jugada;

import java.util.List;

@Data
public class Jugador {
    private String nombre;
    private List<Carta> cartas;
    private boolean isMano;
    private boolean isTurno;

    /*
    * TODO: remover la carta de la mano (List<Carta> cartas)
    * TODO: calcular puntos adicionales
    * TODO: finalizar turno (isTurno = false)
    */
    public void tirar( Carta carta, Jugada jugada ) {
        if ( jugada != null ) {
            cartas.remove( carta );
            short puntosAdicionales = obtenerPuntosJugada( jugada );
        }
    }

    public void envido( Carta primera, Carta segunda ) {

    }

    private static short obtenerPuntosJugada( Jugada jugada ) {
        switch ( jugada ) {
            case TRUCO:
                return 2;
            case RETRUCO:
                return 3;
            case VALECUATRO:
                return 4;
            default:
                return 0;
        }
    }
}
