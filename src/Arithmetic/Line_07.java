package src.Arithmetic;

public class Line_07 {

	// output = 2 -4 100 8 -10 100 -10 100 14
	public static void main(String[] args) {
		int n = 9;
		int idx = 1;
		int idxGenap = 2;
		int[] bilGenap = new int[n];

		for (int i = 0; i < bilGenap.length; i++) {
			if (idx == 1 || idx % 4 == 0) {
				bilGenap[i] = -(idxGenap);
			} else if (idx % 3 == 0) {
				bilGenap[i] = 100;
			} else {
				bilGenap[i] = idxGenap;
			}

			idx += 1;
			idxGenap += 2;
		}

		for (int i : bilGenap) {
			System.out.printf("%5s", i);
		}

	}

}
