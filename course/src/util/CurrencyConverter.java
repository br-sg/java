package util;

public class CurrencyConverter {
	
	public static double dolar;
	public static double real;
	public static double taxa;
	public static double iof = 1.06;
	
	public static double Converter() {
	 return	dolar * taxa * iof;
	}
	

}
