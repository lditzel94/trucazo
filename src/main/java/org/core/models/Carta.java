package org.core.models;

import lombok.Data;
import org.core.enums.Palo;

@Data
public class Carta {
    private Palo palo;
    private short numero;
}
