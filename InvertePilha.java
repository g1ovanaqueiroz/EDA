package invertePilha;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class InvertePilha {
	
	public static <E> void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int size = Integer.parseInt(reader.nextLine());
		String[] input = reader.nextLine().split(" ");
		Stack stack = new Stack();
		
		for (int i = input.length - 1; i >= 0; i--) {
			stack.push(input[i]);
		}
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(stack.pop());
		}
	}
}
