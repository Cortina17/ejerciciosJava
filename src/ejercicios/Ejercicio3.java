package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		table();
		netSalary();

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

}
