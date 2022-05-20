package ejercicios;

public class GetterYSetters {
//getters y setters son una interfaz publica para acceder a atributos privados de una clase
	private String description;
	private char colorCode;
	private double price;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public char getColorCode() {
		return colorCode;
	}
	public void setColorCode(char colorCode) {
		this.colorCode = colorCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
