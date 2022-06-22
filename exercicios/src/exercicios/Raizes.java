package exercicios;
import java.util.Scanner;

public class Raizes {
// x2 + x - 6 = 0
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Resolvedor de eq 2 grau\n");
		System.out.println("a:");
		double a = keyboard.nextDouble();
		System.out.println("b:");
		double b = keyboard.nextDouble();
		System.out.println("c:");
		double c = keyboard.nextDouble();
		keyboard.close();

		double delta = (b*b) - 4*a*c;
		delta = Math.sqrt(delta);
		double x1 = (-b -delta) / 2*a;
		double x2 = (-b +delta) / 2*a;
		System.out.println("X1: " + x1);
		System.out.println("X2: " + x2);
	}

}
