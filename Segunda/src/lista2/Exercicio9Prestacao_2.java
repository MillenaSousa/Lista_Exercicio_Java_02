package lista2;

import java.util.Scanner;

public class Exercicio9Prestacao_2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		float valor;
		int tempoG;
		float taxa = 11;
		float prestacao;

		System.out.println("Informe o valor da prestação: ");
		valor = obj.nextFloat();
		System.out.println("Informe o tempo de atraso em dias:  ");
		tempoG = obj.nextInt();

		prestacao = valor + (valor * taxa / 100) * tempoG;
		System.out.println("O valor da prestação com juros é de: " + prestacao);
		obj.close();
	}

}
