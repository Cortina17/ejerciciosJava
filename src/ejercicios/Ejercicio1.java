package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		Ejerc1();
	}

	static void Ejerc1() {
		// tipo de division
		char division = 'A';

		// cantidad de goles
		byte goals = 5;

		// capacidad del estadio
		int capacity = 90000;

		// promedio de goles
		float gpm = 2.2f;

		System.out.println("El equipo de la division '" + division + "', mete una media de " + gpm
				+ " por partido. El ultimo partido metio " + goals + "  goles y lo vieron " + capacity + " espectadores.");
	}

}
