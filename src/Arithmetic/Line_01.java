package src.Arithmetic;

public class Line_01 {

	// output = -1 3 -5 7 -9 11 -13 15 -17
	public static void main(String[] args) {

		int n = 9;
		int idx = 1;
		int idxGanjil = 1;
		int[] bilGanjil = new int[n];

		for (int i = 0; i < bilGanjil.length; i++) {
			if (idx % 2 == 1) {
				bilGanjil[i] = -(idxGanjil);
			} else {
				bilGanjil[i] = idxGanjil;
			}
			idx += 1;
			idxGanjil += 2;
		}

		for (int j = 0; j < bilGanjil.length; j++) {
			System.out.printf("%5s", bilGanjil[j]);
		}

	}

}
