package exercicios;
import java.util.Scanner;

public class IdadesMedia {

	public static void main(String[] args) {
		int idades[] = new int[10];
		Scanner keyboard = new Scanner(System.in);
		double media = 0;

		for (int i = 0; i < idades.length; i++){
			idades[i] = keyboard.nextInt();
			media += idades[i];
		}
		keyboard.close();
		media = media/idades.length;
		
		System.out.println("média: " + media);
		System.out.println("acima da média:");
		for (int idade: idades)
			if (idade > media)
				System.out.println(idade);
		System.out.println("abaixo da média:");
		for (int idade: idades)
			if (idade < media)
				System.out.println(idade);

	}

}
