package inverteFrase;

import java.util.Scanner;
import java.util.Stack;

class InverteFrase {
	
	private static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// recebe a frase
		String frase = reader.nextLine();
		//variaveis auxiliares
		Stack stack = new Stack();
		String palavra = "";
		String result = "";
		
		// adiciona cada palavra na pilha
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				stack.push(palavra);
				palavra = "";
			} else {
				palavra += frase.charAt(i);
			}
			
		}
		stack.push(palavra);
		
		// adiciona da string resultado os elementos do fim pro comeco
		while (!stack.isEmpty()) {
			result += stack.pop() + " ";
		}
		
		// remove o utimo espaco e imprime o resultado
		result = result.trim();
		System.out.println(result);
	}

}
