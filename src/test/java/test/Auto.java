package test;

import java.util.Arrays;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cont = 0;
		if (asientos != null) {
			for (Asiento o : asientos) {
				if (o != null) {
					cont++;
				}
			}
		}
		return cont;
	}
	
	public String verificarIntegridad() {
		String check = "Auto original";
		
		if (motor.registro != this.registro) {
			check = "Las piezas no son originales";
		}
		
		for (Asiento o : asientos) {
            if (o != null) {
                if (o.registro != this.registro) {
                    check = "Las piezas no son originales";
                    break;
                }
            }
        }
		
		return check;
	}
}
