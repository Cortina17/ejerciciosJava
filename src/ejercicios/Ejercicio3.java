package ejercicios;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		table();
		netSalary();
		salarioNetoRandom();
	}

	static void table() {
		int i = 7;

		for (int j = 0; j < 11; j++) {
			System.out.println((i + " X " + j + " = " + i * j));
		}
	}

	static void netSalary() {

		byte ant = 2;
		char cat = 'B';
		double salary = 10000;
		double totalSalary = 0;
		double totalBonus = 0;

		if (ant > 1 && ant <= 5) {
			totalSalary = salary * 1.05;
		}
		if (ant > 6 && ant <= 10) {
			totalSalary = salary * 1.10;
		}
		if (ant > 10) {
			totalSalary = salary * 1.30;
		}

		switch (cat) {
		case 'A':
			totalBonus = totalSalary + 1000;
		case 'B':
			totalBonus = totalSalary + 2000;
		case 'C':
			totalBonus = totalSalary + 3000;
		}

		System.out.println("Total salary is: " + totalBonus + " euros.");
	}

	static void salarioNetoRandom() {
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			char randomCharacter = ' ';
			int antiguedad = 0;
			int sueldo = 0;
			while (randomCharacter != 'a' && randomCharacter != 'b' && randomCharacter != 'c') {
				randomCharacter = (char) (random.nextInt(26) + 'a');
			}
			sueldo = random.nextInt(50000) + 10000;
			antiguedad = random.nextInt(45) + 1;
			System.out.println("Categoria: " + randomCharacter + " Sueldo: " + sueldo + " Antiguedad: " + antiguedad);
			switch (randomCharacter) {
			case 'a':
				if (antiguedad < 6) {
					System.out.println("Sueldo neto = " + (sueldo * 1.05 + 1000));
				} else if (antiguedad < 11) {
					System.out.println("Sueldo neto = " + (sueldo * 1.10 + 1000));
				} else {
					System.out.println("Sueldo neto = " + (sueldo * 1.30 + 1000));
				}
				break;
			case 'b':
				if (antiguedad < 6) {
					System.out.println("Sueldo neto = " + (sueldo * 1.05 + 2000));
				} else if (antiguedad < 11) {
					System.out.println("Sueldo neto = " + (sueldo * 1.10 + 2000));
				} else {
					System.out.println("Sueldo neto = " + (sueldo * 1.30 + 2000));
				}
				break;
			case 'c':
				if (antiguedad < 6) {
					System.out.println("Sueldaso neto = " + (sueldo * 1.05 + 3000));
				} else if (antiguedad < 11) {
					System.out.println("Sueldo neto = " + (sueldo * 1.10 + 3000));
				} else {
					System.out.println("Sueldo neto = " + (sueldo * 1.30 + 3000));
				}
				break;
			}
		}
	}

}
