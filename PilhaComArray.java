package pilhaComArray;

import java.util.Scanner;

class PilhaComArray {

	private static int[] array;
	private static int tail = -1;

	private static void pop() {
		tail--;
	}

	private static void push(int value) {
		tail++;
		array[tail] = value;
	}

	private static boolean isEmpty() {
		return tail == -1;
	}

	private static boolean isFull() {
		return tail == array.length - 1;
	}

	public static void printArray() {
		String result = "";
		for (int i = 0; i <= tail; i++) {
			result += array[i] + " ";
		}
		System.out.println(result.trim());
	}

	public static void main(String[] args) {

		// leitura do tamanho da pilha
		Scanner reader = new Scanner(System.in);
		int size = Integer.parseInt(reader.nextLine());
		array = new int[size];

		String comando = reader.nextLine().trim();

		while (!comando.equals("end")) {

			if (comando.equals("print")) {
				if (isEmpty()) {
					System.out.println("empty");
				} else {
					printArray();
				}
			}

			if (comando.equals("peek")) {
				if (isEmpty())
					System.out.println("empty");
				else
					System.out.println(array[tail]);
			}

			if (comando.split(" ")[0].equals("push")) {
				if (size <= 0) {
					System.out.println("empty");
				} else {
					if (isFull())
						System.out.println("full");
					else
						push(Integer.parseInt(comando.split(" ")[1]));
				}

			}

			if (comando.equals("pop")) {
				if (isEmpty())
					System.out.println("empty");
				else
					pop();
			}

			comando = reader.nextLine().trim();
		}
	}

}
