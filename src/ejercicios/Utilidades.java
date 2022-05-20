package ejercicios;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Utilidades {

	private static int day;
	private static int month;
	private static int year;

	public static void main(String[] args) {
		daysPerMonth(day);
		leapYear(day);
		greet();
	
	}

	public static int daysPerMonth(int month) {
		return 4;
	}

	public static boolean leapYear(int year) {
		return true;
	}

	static void greet() {
		LocalTime timeStamp = LocalTime.now();
		System.out.println(timeStamp);
	}
}
