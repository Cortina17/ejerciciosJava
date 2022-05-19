package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		table();
		netSalary();

	}

	static void table() {
		int i = 2;

		for (int j = 0; j < 11; j++) {
			System.out.println((i * j));
		}
	}

	static void netSalary() {

		byte ant = 3;
		String cat = "A";
		int salary;
		int totalSalary;

		if (ant > 1 && ant <= 5) {
			totalSalary = salary + (salary * (5 / 100));
		}

		System.out.println("Total salary is the result of ");
	}
}
