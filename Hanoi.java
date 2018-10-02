package torreDeHanoi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Hanoi {

	private static int qtDiscos;
	private String[] sequenciaImpares = { "da haste A para a haste C", "da haste C para a haste B",
			"da haste B para a haste A" }; // para impares
	private String[] sequenciaPares = { "da haste A para a haste B", "da haste B para a haste C",
			"da haste C para a haste A" }; // para pares
	private List<Disco> arrayDiscos = new ArrayList<Disco>();

	public void lerDados() {
		Scanner reader = new Scanner(System.in);
		qtDiscos = Integer.parseInt(reader.nextLine());
	}

	public void hanoi() {
		int maxP = (int) Math.pow(2, qtDiscos);
		int y = 1;
		int pos = 1;

		while (y <= qtDiscos) {
			int ctPulos = (int) Math.pow(2, y);
			pos *= 2;

			if (y == 1) {
				pos = 1;
			}
			if (qtDiscos % 2 == 0) {
				populaArrayPares(pos, ctPulos, maxP, y);
			} else {
				populaArrayImpares(pos, ctPulos, maxP, y);
			}
			y++;
		}
	}

	private void populaArrayImpares(int pos, int intervalos, int maxP, int y) {
		int index = 0;
		if (y % 2 == 0) {
			for (int i = pos; i < maxP; i += intervalos) {
				Disco d = new Disco(i, sequenciaPares[index], y);
				arrayDiscos.add(d);
				index++;
				if (index > 2) {
					index = 0;
				}
			}
		} else {
			for (int i = pos; i <= maxP; i += intervalos) {
				Disco d = new Disco(i, sequenciaImpares[index], y);
				arrayDiscos.add(d);
				index++;
				if (index > 2) {
					index = 0;
				}
			}
		}
	}

	private void populaArrayPares(int pos, int intervalos, int maxP, int y) {
		int index = 0;
		if (y % 2 == 0) {
			for (int i = pos; i <= maxP; i += intervalos) {
				Disco d = new Disco(i, sequenciaImpares[index], y);
				arrayDiscos.add(d);
				index++;
				if (index > 2) {
					index = 0;
				}
			}
		} else {
			for (int i = pos; i < maxP; i += intervalos) {
				Disco d = new Disco(i, sequenciaPares[index], y);
				arrayDiscos.add(d);
				index++;
				if (index > 2) {
					index = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Hanoi h = new Hanoi();
		h.lerDados();
		h.hanoi();
		Collections.sort(h.arrayDiscos);
		for (Disco d : h.arrayDiscos) {
			System.out.println("Move o disco " + d.ID + " " + d.movimento);
		}
	}
	
	class Disco implements Comparable<Disco> {
		Integer index;
		String movimento;
		Integer ID;

		Disco(int index, String movimento, int ID) {
			this.index = index;
			this.movimento = movimento;
			this.ID = ID;
		}

		public int compareTo(Disco o) {
			return index.compareTo(o.index);
		}
	}

}
