package exercicios;
import java.util.Scanner;

public class Paridade {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		double entrada = keyboard.nextDouble();
		keyboard.close();
		
		System.out.println(entrada + " é " + (entrada%2 != 0 ? "ímpar." : "par."));
	}

}
