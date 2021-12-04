/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */
package jo_2_algorithmisation;

import java.util.Random;
import java.util.Scanner;

public class MultiArrayTask15 {

	public static void main(String[] args) {
		int[][] a;
		int[] size;
		int max;
		int maxNumberInRow; // Наибольший элемент матрицы
		int maxNumber; // Наибольший элемент матрицы
		
		max = 100;
		maxNumberInRow = 0;
		maxNumber = 0;
		size = returnSize();
		a = createArray(size, max);
		
		printArray(a, "Исходный массив: ");
		for (int i = 0; i < size[0]; i++) {
			for (int j = 0; j < size[0]; j++) {
				if (Math.max(maxNumberInRow,  a[i][j]) == a[i][j]) {
					maxNumberInRow = a[i][j];
				}
			}
			if (Math.max(maxNumber, maxNumberInRow) == maxNumberInRow) {
				maxNumber = maxNumberInRow;
			}	
		}
		System.out.println("Наибольший элемент в матрице: " + maxNumber);
		for (int i = 0; i < size[0]; i++) {
			for (int j = 0; j < size[1]; j++) {
				if (a[i][j] % 2 != 0) {
					a[i][j] = maxNumber;
				}
			}
		}
		printArray(a, "Итоговый массив: ");
	}
	
	static int[] returnSize() {
		int[] size;
		
		size = new int[2];
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите кол-во строк матрицы >>> n = ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите кол-во строк матрицы >>> n =");
		}
		size[0] = sc.nextInt();
		
		System.out.print("Введите кол-во столбцов матрицы >>> m = ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите кол-во столбцов матрицы >>> m =");
		}
		
		size[1] = sc.nextInt();
		
		return size;
	}
	
	static int[][] createArray(int[] size, int max) {
		int[][] a;
		Random r;

		a = new int[size[0]][size[1]];
		r = new Random();
		
		for (int i = 0; i < size[0]; i++) {
			for (int j = 0; j < size[1]; j++) {
				a[i][j] = r.nextInt(max) - r.nextInt(max);
			}
		}
		return a;
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
