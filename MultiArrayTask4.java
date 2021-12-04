/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * {1, 2, 3, ..., n
 *  n, n-1, n-2, ... 1
 *  1, 2, 3, ..., n
 *  ...
 *  n, n-1, n-2, ..., n}
 */
package jo_2_algorithmisation;

import java.util.Scanner;

public class MultiArrayTask4 {
	private static int size;
	private static int[][] a;

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
		int starterEven;
		int starterOdd;
		
		starterEven = 1;
		starterOdd = size;
		a = new int[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i % 2 != 0) {
					a[i][j] = starterOdd--;
				} else {
					a[i][j] = starterEven++;	
				}
			}
			starterEven = 1;
			starterOdd = size;
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
