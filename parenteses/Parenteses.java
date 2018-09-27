package parenteses;

import java.util.Scanner;
import java.util.Stack;

class Parenteses {

	public static void main(String[] args) {
		// reading input
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();

		Stack stack = new Stack();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(')
				stack.push(input.charAt(i));
			else if (stack.isEmpty() && input.charAt(i) == ')')
				stack.push("(");
			else
				stack.pop();
		}

		if (stack.isEmpty())
			System.out.println("S");
		else
			System.out.println("N");
	}

}
