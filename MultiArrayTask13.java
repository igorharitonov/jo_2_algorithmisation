/*
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
package jo_2_algorithmisation;

import java.util.Random;

public class MultiArrayTask13 {
	private static int[][] a;
	private static int[] size;
	
	static {
		size = new int[]{4, 6};
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
				while (i + next < a.length) {
						if (a[i][j] >  a[i + next][j]) {
							transfer = a[i][j];
							a[i][j] =  a[i + next][j];
							a[i + next][j] = transfer;
						}
						next++;
				}
			}
		}
		printArray(a, "Результирующая матрица по возрастанию в столбце: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				next = 0;
				while (i + next < a.length) {
						if (a[i][j] <  a[i + next][j]) {
							transfer = a[i][j];
							a[i][j] =  a[i + next][j];
							a[i + next][j] = transfer;
						}
						next++;
				}
			}
		}
		printArray(a, "Результирующая матрица по убыванию в столбце: ");

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
	
	public static void printArray(int[][] a) {
		System.out.println("Исходная матрица: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void printArray(int[][] a, String msg) {
		System.out.println(msg);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
