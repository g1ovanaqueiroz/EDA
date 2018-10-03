package filaLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class FilaLinkedList {

	private static LinkedList<Integer> list = new LinkedList<Integer>();
	private static String EMPTY = "empty";
	private static String FULL = "full";

	public static void main(String[] args) {
		// leitura
		Scanner input = new Scanner(System.in);
		String entrada = input.nextLine().trim();

		// menu
		while (!entrada.equals("end")) {
			if (entrada.equals("print"))
				printArray();
			if (entrada.equals("element"))
				printElement();
			if (entrada.equals("remove"))
				printRemove();
			if (entrada.split(" ")[0].equals("add"))
				printAdd(entrada.split(" ")[1]);
			if (entrada.split(" ")[0].equals("search"))
				printSearch(entrada.split(" ")[1]);
			entrada = input.nextLine().trim();
		}
	}

	private static void printArray() {
		if (isEmpty())
			System.out.println(EMPTY);
		else
			System.out.println(toArray());

	}

	private static void printElement() {
		if (isEmpty()) {
			System.out.println(EMPTY);
		} else {
			System.out.println(element());
		}

	}

	private static void printRemove() {
		if (isEmpty())
			System.out.println(EMPTY);
		else
			remove();
	}

	private static void printAdd(String element) {
		if (isFull()) 
			System.out.println(FULL);
		else
			add(element);
	}

	private static void printSearch(String element) {
		if (isEmpty())
			System.out.println(EMPTY);
		else {
			System.out.println(search(element));
		}

	}

	private static String[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String search(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void add(String string) {
		// TODO Auto-generated method stub

	}

	private static void remove() {
		if (isEmpty()) {
			System.out.println(EMPTY);
		} else {
			System.out.println(element());
		}

	}

	private static String element() {
		return null;
		// TODO Auto-generated method stub

	}

	public static boolean isFull() {
		return false;
	}

	public static boolean isEmpty() {
		return false;
	}

}
