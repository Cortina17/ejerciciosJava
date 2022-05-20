package ejercicios;

public class TestHerencia {

	public static void main(String[] args) {

		Empleado e = new Empleado();
		// e. sugiere los atributos de la clase empleado

		e.name = "Lou";
		e.salary = 2000;

		System.out.println(e.getDetails());

		System.out.println();

		Gerente g = new Gerente();
		g.department = "Ventas";
		g.name = "Cor";
		g.salary = 8000;
		
		System.out.println(g.getDetails());
	}

}
