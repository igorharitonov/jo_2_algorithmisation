/*
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */
package jo_2_algorithmisation;

import java.util.Random;
import java.util.Scanner;

public class MultiArrayTusk9 {
	static int[] size;
	static int[][] a;
	

	public static void main(String[] args) {
		size = returnSize();
		a = createArray(size);
		int max;
		int sum;
		int maxColumn;
		int i;
		
		max = 0;
		sum = 0;
		maxColumn = 0;
		i = 0;
		printArray(a);
		
		System.out.println("Суммы по колонкам: ");
		for (int j = 0; j < a[0].length; j++) {
			do {
				sum = sum + a[i][j];
				i++;
			} while (i < a.length);
			i = 0;
			max = Math.max(max, sum);
			if (max == sum) {
				maxColumn = i;
			}
			System.out.print("Сумма  " + (j + 1) + ": " + sum + "\t");
			sum = 0;
		}
		System.out.println("\r\nНомер колонки с максимальной суммой: " + (maxColumn + 1));
	}
	
	private static int[] returnSize() {		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] size;
		
		size = new int[2];
		
		System.out.print("Введите кол-во строк матрицы (четное натуральное число, большое нуля) >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите кол-во строк матрицы  (четное натуральное число, большое нуля) >>> ");
		}
		size[0] = sc.nextInt();
		System.out.print("Введите кол-во столбцов матрицы (четное натуральное число, большое нуля) >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите кол-во столбцов матрицы (четное натуральное число, большое нуля) >>> ");
		}
		size[1] = sc.nextInt();
		
		return size;
	}
	
	private static int[][] createArray(int[] size) {
		a = new int[size[0]][size[1]];
		Random r = new Random();
		
		for (int i = 0; i < size[0]; i++) {
			for (int j = 0; j < size[1]; j++) {
				a[i][j] = r.nextInt(20);
				if (a[i][j] < 0) {
					a[i][j] = Math.abs(a[i][j]);
				}
			}
		}
		
		return a;
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
