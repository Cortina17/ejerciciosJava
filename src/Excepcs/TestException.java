package Excepcs;

public class TestException {

	public static void main(String[] args) {
		Conexion c = new Conexion();
		try {
			c.conectar("Capg");
		} catch (ServerTimedOutException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage() + " El puerto " + e.getPort() + " no llega a abrirse.");
		}
	}
}
