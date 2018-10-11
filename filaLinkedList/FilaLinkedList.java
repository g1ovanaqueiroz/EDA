package filaLinkedList;

import java.util.Scanner;

class FilaLinkedList {

	protected static RecursiveDoubleLinkedListNode top = new RecursiveDoubleLinkedListNode(10);
	protected static String FULL = "full";
	protected static String EMPTY = "empty";

	public static void main(String[] args) {

		// entrada
		Scanner input = new Scanner(System.in);
		String[] comando = input.nextLine().split(" ");

		// menu
		while (!comando[0].trim().equals("end")) {

			// casos de comando
			if (comando[0].equals("print"))
				printArray();
			if (comando[0].equals("element"))
				printElement();
			if (comando[0].equals("remove"))
				remove();
			if (comando[0].equals("add"))
				add(comando[1]);
			if (comando[0].equals("search"))
				printSearched(comando[1]);

			// nova leitura
			comando = input.nextLine().split(" ");
		}

	}

	private static void printSearched(String element) {
		if (top.isEmpty())
			System.out.println("-1");
		else
			System.out.println(top.indexOf(element));

	}

	private static void add(String element) {
		if (top.isFull())
			System.out.println(FULL);
		else
			top.add(element);

	}

	private static void remove() {
		if (top.isEmpty())
			System.out.println(EMPTY);
		else
			top.remove();
	}

	private static void printElement() {
		if (!top.isEmpty())
			System.out.println(top.toArray()[0]);
	}

	private static void printArray() {
		if (top.isEmpty())
			System.out.println(EMPTY);
		else
			System.out.println(top.toString());
	}

}

class RecursiveDoubleLinkedListNode {

	protected int size;
	protected RecursiveDoubleLinkedListNode previous;
	protected RecursiveDoubleLinkedListNode next;
	protected String data;
	protected int actualSize;

	public RecursiveDoubleLinkedListNode(int size) {
		this.size = size;
		this.actualSize = 0;
	}

	public RecursiveDoubleLinkedListNode(int size, RecursiveDoubleLinkedListNode previous,
			RecursiveDoubleLinkedListNode next, String data) {
		this.size = size;
		this.previous = previous;
		this.next = next;
		this.actualSize = 0;
		this.data = data;
	}

	public RecursiveDoubleLinkedListNode getNext() {
		return this.next;
	}

	public RecursiveDoubleLinkedListNode getPrevious() {
		return this.previous;
	}

	private String getData() {
		return this.data;
	}

	public void setNext(RecursiveDoubleLinkedListNode node) {
		this.next = node;
	}

	public void setPrevious(RecursiveDoubleLinkedListNode node) {
		this.previous = node;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isEmpty() {
		return this.data == null;
	}

	public boolean isFull() {
		return this.getActualSize() == this.size;
	}

	private int getActualSize() {
		return actualSize;
	}

	public String[] toArray() {
		String[] result = new String[this.getActualSize()];
		if (!this.isEmpty()) {
			RecursiveDoubleLinkedListNode aux = new RecursiveDoubleLinkedListNode(this.size, this.previous,
					this.next, this.data);
			int i = 0;
			while (!aux.isEmpty()) {
				result[i] = aux.getData();
				i++;
				aux = aux.next;
			}
		}
		return result;
	}

	public int indexOf(String element) {
		int result = -1;
		boolean achou = false;
		int i = 0;
		while (!achou && i < this.getActualSize()) {
			if (this.toArray()[i].equals(element)) {
				result = i;
				achou = true;
			} else {
				i++;
			}
		}
		return result;
	}

	public void add(String element) {
		if (isEmpty()) { // caso base: adiciona nele mesmo
			this.data = element;
			this.next = new RecursiveDoubleLinkedListNode(this.size - 1);
			this.next.setPrevious(this);
		} else {
			this.next.add(element);
		}
		this.actualSize++;
	}

	@Override
	public String toString() {
		String result = "";
		if (!this.isEmpty()) {
			int i = 0;
			while (i < this.getActualSize() - 1) {
				result += this.toArray()[i] + " ";
				i++;
			}
			result += this.toArray()[i];
		}
		return result;
	}

	public String element() {
		return this.toArray()[0];
	}

	public void remove() {
		this.setData(this.next.getData());
		this.setNext(this.next.next);
		actualSize--;
	}
}
