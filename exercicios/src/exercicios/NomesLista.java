package exercicios;
import java.util.Scanner;

public class NomesLista {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String nomes[] = new String[20];
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = keyboard.next();
		}
		
		String chave = "nada";
		chave = keyboard.next();
		while (!chave.equals("parar")) {
			String saida = "";
			for (String nome : nomes) 
				if (nome.equals(chave)) { saida = "Existe"; }
			System.out.println(saida.equals("") ? "Não existe" : saida);
			chave = keyboard.next();
		}

		keyboard.close();
	}

}
