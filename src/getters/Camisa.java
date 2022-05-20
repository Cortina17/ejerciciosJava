package getters;

public class Camisa {

	private String description;
	private char colorCode;
	private double price;

	public Camisa() {
	}
	
	public Camisa(String desc, char color, double price) {
		this.description = desc;
		this.colorCode = color;
		this.price = price;
	}

	public void setFields(String desc, char color, double price) {
		this.description = desc;
		this.colorCode = color;
		this.price = price;
	}

	public String getFields() {
		return this.description + ", " + this.colorCode + ", " + this.price;
	}

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
