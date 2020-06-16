
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		char p;
		double celsius, fahrenheit;
				

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();
				fahrenheit = ((9*celsius)/5) +32;
				System.out.printf("Equivalente em  Fahrenheit: %.1f%n", fahrenheit);
				System.out.print("Deseja repetir (s/n)? ");
				p = sc.next().charAt(0);
		}
		
	while (p != 'n');

		
		sc.close();

} }
