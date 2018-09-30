package moveImpostor;

import java.util.Scanner;

public class MoveImpostor {

	public static void main(String[] args) {

		// leitura
		Scanner reader = new Scanner(System.in);
		String[] input = reader.nextLine().split(" ");

		// transformando em array de inteiros
		int[] array = new int[input.length];
		for (int i = 0; i < input.length; i++)
			array[i] = Integer.parseInt(input[i]);

		// encontrando o impostor
		int impostorIndex = 1;
		while (array[impostorIndex] > array[impostorIndex - 1])
			impostorIndex++;

		// movendo o impostor para o seu devido lugar
		while (impostorIndex > 0 && array[impostorIndex] < array[impostorIndex - 1]) {
			swap(array, impostorIndex, impostorIndex - 1);
			impostorIndex--;
		}

		// imprime o array ordenado
		System.out.println(stringArray(array));
	}

	/**
	 * Recebe um array de inteiros e devolve uma representação em string dos seus
	 * elementos
	 * 
	 * @param array array usado como base para a string
	 * @return string
	 */
	private static String stringArray(int[] array) {
		String str = "[";
		for (int i = 0; i < array.length - 1; i++)
			str += array[i] + ", ";
		str += array[array.length - 1] + "]";
		return str;
	}

	/**
	 * Troca a posição de dois elementos em um array de inteiros
	 * 
	 * @param array array a ser modificado
	 * @param i     indice do elemento a ser trocado
	 * @param j     indice do elemento a ser trocado
	 */
	private static void swap(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;

	}
}
