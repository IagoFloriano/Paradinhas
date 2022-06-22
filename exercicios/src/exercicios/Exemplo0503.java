package exercicios;
import java.util.Scanner;

public class Exemplo0503 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Aluno al = new Aluno();
		al.setNome(kbd.nextLine());
		al.setEmail(kbd.nextLine());
		kbd.close();
		System.out.println(al.getNome() + " " + al.getEmail());

	}

}
