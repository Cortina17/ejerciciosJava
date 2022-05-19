package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		media();
		evenOdd();
	}

	static void media() {
		byte firstEval = 7;
		float secondEval = 7.5f;
		byte thirdEval = 8;

		System.out.println(((firstEval + secondEval + thirdEval) / 3 >= 7) ? "Aprobado" : "Suspenso");
	}

	static void evenOdd() {
		int number = 5434532;
		System.out.println((number % 2 == 0) ? "Even number" : "Odd number");
	}
}
