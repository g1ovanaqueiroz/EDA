package furaFila;

import java.util.Scanner;

public class FuraFila {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] input = reader.nextLine().split(" ");
		int index = reader.nextInt();
		int aux = 0;

		for (int i = index; i < input.length; i++) {
			int controle = i;
			while (controle > aux) {
				swap(input, controle, controle - 1);
				controle--;
			}
			System.out.println(stringArray(input));
			aux++;
		}
	}

	/**
	 * Transforma o array em uma string
	 * 
	 * @return string
	 */
	private static String stringArray(String[] input) {
		String str = "[";
		for (int i = 0; i < input.length - 1; i++)
			str += input[i] + ", ";
		str += input[input.length - 1] + "]";
		return str;
	}

	/**
	 * Troca dois elementos num array de String
	 * 
	 * @param input        array a ser modificado
	 * @param i            indice a ser trocado
	 * @param inicioIdosos indice a ser trocado
	 */
	private static void swap(String[] input, int i, int inicioIdosos) {
		String aux = input[i];
		input[i] = input[inicioIdosos];
		input[inicioIdosos] = aux;

	}

}
