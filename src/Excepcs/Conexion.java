package Excepcs;

public class Conexion {

	public void conectar(String nombreServer) throws ServerTimedOutException {
		boolean successful;
		int portToConnect = 8080;
		successful = open(nombreServer, portToConnect);
		if (!successful) {
			throw new ServerTimedOutException("No hubo suerte, pa.", portToConnect);
		}
	}

	public boolean open(String serverName, int portToConnect) {
		System.out.println("Estoy abriendo el server: " + serverName);
		return false;
	}
}
