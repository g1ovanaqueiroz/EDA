package imprimirVetorCircular;

import java.util.Scanner;

class ImprimirVetorCircular {

	public static void main(String[] args) {
		
		// leitura
		Scanner reader = new Scanner(System.in);
		String[] input = reader.nextLine().split(" ");
		int n = reader.nextInt();
		
		// variaveis auxiliares
		int index = 0;
		String result = "";
		
		for (int i = 0; i < n; i++) {
			result += input[index] + " ";
			index = (index + 1) % input.length;
		}
		
		System.out.println(result.trim());
	}
}
