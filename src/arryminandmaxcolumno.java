
public class arryminandmaxcolumno {

	public static void main(String[] args) {

		int a[][] = { { 2, 4, 5 }, { 3, 0, 7 }, { 1, 2, 9 } };
		int min = a[0][0];

		int minindexcolumn = 0;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (a[i][j] < min) {
					min = a[i][j];
					minindexcolumn = j;
					System.out.println("Minimum index column "+ minindexcolumn);
					System.out.println("Minimum value column "+ min);
					

				}
			}
		}
		int max = a[0][minindexcolumn];
		int k = 0;
		while (k < 3) {

			if (a[k][minindexcolumn] > max) {

				max = a[k][minindexcolumn];

			}
			k++;
		}
		System.out.println("Max value in column " +max);
	}

}
