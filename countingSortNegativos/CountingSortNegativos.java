package countingSortNegativos;
import java.util.Scanner;

public class CountingSortNegativos {

	public static void main(String[] args) {

		// reading
		Scanner reader = new Scanner(System.in);
		String[] input = reader.nextLine().split(" ");
		int maior = reader.nextInt();
		int menor = reader.nextInt();

		// creating an int array
		int[] vector = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			vector[i] = Integer.parseInt(input[i]);
		}

		countigSortNergativos(vector, maior, menor);
	}

	/**
	 * Sorting method
	 * 
	 * @param vector: an int vector
	 * @param head: the bigger number
	 * @param less: the minor number
	 */
	private static void countigSortNergativos(int[] vector, int head, int less) {

		int[] aux = new int[(head - less) + 1];

		// frequency calculation and printing the vector at each iteration
		for (int i : vector) {
			aux[i - less]++;
			System.out.println(stringVector(aux));
		}

		for (int i = 1; i < aux.length; i++) {
			aux[i] += aux[i - 1];
		}

		System.out.println("Cumulativa do vetor de contagem - " + stringVector(aux));

		int[] places = new int[vector.length];
		for (int i = 0; i < places.length; i++) {
			places[aux[vector[i] - less] - 1] = vector[i];
			aux[vector[i] - less]--;
		}
		
		System.out.println(stringVector(aux));
		System.out.println(stringVector(places));
	}

	/**
	 * return a string vector version
	 * 
	 * @param vector: an int vector
	 * @return string
	 */
	private static String stringVector(int[] vector) {
		String result = "[";
		for (int i = 0; i < vector.length; i++) {
			result += vector[i];
			if (i != vector.length - 1)
				result += ", ";
		}
		result += "]";
		return result;
	}
}
