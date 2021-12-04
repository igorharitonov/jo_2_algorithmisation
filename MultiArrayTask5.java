/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * {1, 1, 1, ..., 1, 1
 *  2, 2, 2, ..., 2, 0
 *  3, 3, 3, ..., 0, 0
 *  ...
 *  n-1, n-1, 0, ..., 0
 *  n, 0, 0, 0, ..., 0}
 */
package jo_2_algorithmisation;

import java.util.Scanner;

public class MultiArrayTask5 {
	private static int[][] a;
	private static int size;

	public static void main(String[] args) {
		size = returnSize();
		a = createArray(size);
		
		for (int[] row: a) {
			for (int elem: row) {
				System.out.print("\t" + elem);
			}
			System.out.println();
		}
	}
	
	private static int[][] createArray(int size) {
		a = new int[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0) {
					a[i][j] = i + 1;
				} else {
					if (j >= size - i) {
						a[i][j] = 0;
					} else {
						a[i][j] = i + 1;
					}
				}
			}
		}
		
		return a;
	}
	
	private static int returnSize() {		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите размер квадратной матрицы (четное натуральное число, большое нуля) >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите размер квадратной матрицы (четное натуральное число, большое нуля) >>> ");
		}
		
		size = sc.nextInt();
		if ((size % 2 != 0) || (size == 0)) {
			returnSize(); // Recursion Function
		}
		return size;
	}

}
