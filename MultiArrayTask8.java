/*
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */
package jo_2_algorithmisation;

import java.util.Scanner;
import java.util.Random;

public class MultiArrayTask8 {
		
	public static void main(String[] args) {
		double[][] a;
		int[] size;
		
		size = returnSize();
		a = createArray(size);
		
		printArray(a);
		
		

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
	
	private static double[][] createArray(int[] size) {
		double[][] a;
		a = new double[size[0]][size[1]];
		Random r = new Random();
		
		for (int i = 0; i < size[0]; i++) {
			for (int j = 0; j < size[1]; j++) {
				a[i][j] = r.nextDouble() * r.nextInt();
			}
		}
		
		return a;
	}
	
	private static void printArray(double[][] a) {
		for (double[] row: a) {
			for (double elem: row) {
				System.out.print("\t" + elem);
			}
			System.out.println();
		}
	}

}
