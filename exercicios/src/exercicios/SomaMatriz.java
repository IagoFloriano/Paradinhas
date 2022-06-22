package exercicios;
import java.util.Scanner;

public class SomaMatriz {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int A[][] = new int[3][3];
		int B[][] = new int[3][3];

		System.out.println("Entre valores da primeira matriz 3x3:");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				A[i][j] = keyboard.nextInt();

		System.out.println("Entre valores da segunda matriz 3x3:");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				B[i][j] = keyboard.nextInt();
		keyboard.close();
		
		int C[][] = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				C[i][j] = A[i][j] + B[i][j];
		
		System.out.println("Soma:");
		for (int i = 0; i < 3; i++)
			System.out.println(C[i][0] + " " + C[i][1] + " " + C[i][2] + " ");
	}

}
