/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * {1, 1, 1, ..., 1, 1, 1
 *  0, 1, 1, ..., 1, 1, 0
 *  0, 0, 1, ..., 1, 0, 0
 *  ...
 *  0, 1, 1, ..., 1, 1, 0
 *  1, 1, 1, ..., 1, 1, 1}
 */
package jo_2_algorithmisation;

import java.util.Scanner;

public class MultiArrayTask6 {
	private static int[][] a;
	private static int size;

	public static void main(String[] args) {
		size = returnSize();
		a = createArray(size);
		
		printArray(a);
	}
	
	private static int[][] createArray(int size) {
		int counterFirst;
		int counterLast;
		int rowSwitcher;
		
		counterFirst = 0;
		counterLast = size;
		rowSwitcher = 0;
		a = new int[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (j < counterFirst) {
					a[i][j] = 0;
				} else if (j >= counterLast) {
					a[i][j] = 0;
				} else {
					a[i][j] = 1;
				}
			}
			if (rowSwitcher < (size / 2) - 1) {
				counterFirst++;
				counterLast--;
			} else if (rowSwitcher == size / 2 - 1) {
				
			} else {
				counterFirst--;
				counterLast++;
			}
			rowSwitcher++;
			
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
	
	private static void printArray(int[][] a) {
		for (int[] row: a) {
			for (int elem: row) {
				System.out.print("\t" + elem);
			}
			System.out.println();
		}
	}
}
