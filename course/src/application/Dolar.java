package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

 System.out.print("What is the dollar price? ");
 CurrencyConverter.taxa = sc.nextDouble();
 System.out.print("How many dollares will be bought? ");
 CurrencyConverter.dolar = sc.nextDouble();
 System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.Converter());


		
		
		sc.close();
		
	
} }
