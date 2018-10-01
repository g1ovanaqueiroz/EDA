package invertePilha;

import java.util.Scanner;

class InvertePilha {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int size = Integer.parseInt(reader.nextLine());
		String[] pilha = reader.nextLine().split(" ");
		
		for (int i = 0; i < pilha.length; i++) {
			System.out.println(pilha[i]);
		}
	}

}
