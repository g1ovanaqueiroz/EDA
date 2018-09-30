package stoogeSort;
import java.util.Scanner;

class StoogeSort {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] array = reader.nextLine().split(" ");
		int[] arrayInt = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayInt[i] = Integer.parseInt(array[i]);
		}
		String result = "";
		stoogeSort(arrayInt, 0, array.length - 1);
		for (int i = 0; i < arrayInt.length - 1; i++) {
			result += arrayInt[i] + " ";
		}
		result += arrayInt[arrayInt.length - 1];
		System.out.println(result);
	}

	public static void stoogeSort(int[] array, int ini, int fim) {
		if (array[fim] < array[ini]) {
			swap(array, ini, fim);
		}
		if (ini + 1 >= fim) {
			return;
		}

		int k = (fim - ini + 1) / 3;
		stoogeSort(array, ini, fim - k);
		stoogeSort(array, ini + k, fim);
		stoogeSort(array, ini, fim - k);
	}

	private static void swap(int[] array, int ini, int fim) {
		int aux = array[ini];
		array[ini] = array[fim];
		array[fim] = aux;

	}
}