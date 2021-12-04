/*
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
package jo_2_algorithmisation;

import java.util.Random;

public class MultiArrayTask12 {
	private static int[][] a;
	private static int[] size;
	
	static {
		size = new int[]{2, 4};
	}

	public static void main(String[] args) {
		int transfer;
		int next;
		
		a = createArray(size);
		transfer = 0;
		next = 0;
		
		printArray(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				next = 0;
				while (j + next < a[0].length) {
						if (a[i][j] >  a[i][j + next]) {
							transfer = a[i][j];
							a[i][j] =  a[i][j + next];
							 a[i][j + next] = transfer;
						}
						next++;
				}
			}
		}
		printArray(a, "Результирующая матрица по возрастанию в строке: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				next = 0;
				while (j + next < a[0].length) {
						if (a[i][j] <  a[i][j + next]) {
							transfer = a[i][j];
							a[i][j] =  a[i][j + next];
							 a[i][j + next] = transfer;
						}
						next++;
				}
			}
		}
		printArray(a, "Результирующая матрица по убыванию в строке: ");

	}
	
	private static int[][] createArray(int[] size) {
		a = new int[size[0]][size[1]];
		Random r = new Random();
		
		for (int i = 0; i < size[0]; i++) {
			for (int j = 0; j < size[1]; j++) {
				a[i][j] = r.nextInt(100);
			}
		}
		
		return a;
	}
	
	private static void printArray(int[][] a) {
		System.out.println("Исходная матрица: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	private static void printArray(int[][] a, String msg) {
		System.out.println(msg);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
