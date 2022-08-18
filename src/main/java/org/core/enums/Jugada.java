package org.core.enums;

public enum Jugada {
    TRUCO( 2 ),
    RETRUCO( 3 ),
    VALECUATRO( 4 ),
    ENVIDO( 2 ),
    DOBLE_ENVIDO( 4 ),
    REAL_ENVIDO( 3 );

    public final int valor;

    private Jugada( int valor ) {
        this.valor = valor;
    }
}
