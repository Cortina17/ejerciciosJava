package ejercicios;

public class Gerente extends Empleado {

	protected String department;

	public String getDetails() {
		return super.getDetails() + ", " + department;
	}
}
