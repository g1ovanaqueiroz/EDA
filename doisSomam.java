package doisSomam;

import java.util.Scanner;

class doisSomam {

	public static void main(String[] args) {

		// leitura
		Scanner reader = new Scanner(System.in);
		String[] input = reader.nextLine().split(" ");
		int n = reader.nextInt();

		int aux = 0;
		String result = "-1";

		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (Integer.parseInt(input[i]) + Integer.parseInt(input[j]) == n) {
					result = input[i] + " " + input[j];
				}
			}
		}
		
		System.out.println(result);
	}

}
