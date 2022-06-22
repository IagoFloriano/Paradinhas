package exercicios;
import java.util.Scanner;

public class SomaEntrada {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double soma = 0, entrada = 0;
		while (entrada != -1) {
			soma += entrada;
			System.out.println("Soma atual: " + soma);
			System.out.println("Entre com um novo número:");
			entrada = keyboard.nextDouble();
		}
		keyboard.close();
		
		System.out.println("Soma total: " + soma);
	}

}
