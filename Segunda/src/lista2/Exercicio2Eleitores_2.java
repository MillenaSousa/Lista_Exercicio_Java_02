package lista2;

import java.util.Scanner;

public class Exercicio2Eleitores_2 {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int eleitores;
		float vBrancos;
		float vNulos;
		float vValidos;
		float porcBrancos;
		float porcNulos;
		float porcValidos;

		System.out.println("Informe a quantidade de eleitores: ");
		eleitores = obj.nextInt();
		System.out.println("Informe o total de votos em branco: ");
		vBrancos = obj.nextFloat();
		System.out.println("Informe o total de votos nulos: ");
		vNulos = obj.nextFloat();
		System.out.println("Informe o total de votos v�lidos: ");
		vValidos = obj.nextFloat();

		porcBrancos = vBrancos / eleitores * 100;
		porcNulos = vNulos / eleitores * 100;
		porcValidos = vValidos / eleitores * 100;

		System.out.printf("Porcentagem de votos em branco: %.1f" , porcBrancos);
		System.out.println("%");
		System.out.printf("\nPorcentagem de votos nulos: %.1f",  porcNulos );
		System.out.println("%");
		System.out.printf("\nPorcentagem de votos v�lidos: %.1f", porcValidos);
		System.out.println("%");
		obj.close();

	}
}
