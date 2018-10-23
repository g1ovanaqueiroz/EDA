package elementoSobrando;

import java.util.ArrayList;
import java.util.Scanner;

class ElementoSobrando {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] array1 = scanner.nextLine().split(" ");
		String[] array2 = scanner.nextLine().split(" ");
		ArrayList arrayList = new ArrayList();

		for (String a : array1) {
			arrayList.add(a);
		}

		int index = -1;

		for (int i = 0; i < array2.length; i++) {
			if (!arrayList.contains(array2[i])) {
				index = i;
			}
		}
		System.out.println(array2[index]);
	}

}
