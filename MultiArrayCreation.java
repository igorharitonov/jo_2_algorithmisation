package jo_2_algorithmisation;

import java.util.Random;
import java.util.Scanner;

public class MultiArrayCreation {

	public static void main(String[] args) {
		
	}
	
	/* Метод, получающий из консоли размер матрицы */
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
	
	/* Метод, создающий матрицу целых чисел заданнoго размера */
	static int[][] wholeMultiArrayCreation(int[] size) {
		int[][] a;
		Random r = new Random();
		
		a = new int[size[0]][size[1]];
		
		for (int i1 = 0; i1 < size[0]; i1++) {
			for (int i2 = 0; i2 < size[1]; i2++) {
				 a[i1][i2] = r.nextInt(100);
			}
		}
		return a;
	}
	
	/* Метод, создающий матрицу целых чисел заданнoго размера и величины */
	static int[][] wholeMultiArrayCreationWithMax(int[] size, int max) {
		int[][] a;
		Random r = new Random();
		
		a = new int[size[0]][size[1]];
		
		for (int i1 = 0; i1 < size[0]; i1++) {
			for (int i2 = 0; i2 < size[1]; i2++) {
				 a[i1][i2] = r.nextInt(max);
			}
		}
		return a;
	}
	
	/* Метод, выводящий матрицу целых чисел заданнoго размера */
	static void MultiArrayOutput(int[][] a) {
		
		System.out.println("Созданна¤ случайна¤ матрица: ");
		for (int i1 = 0; i1 < a.length; i1++) {
			for (int i2 = 0; i2 < a[0].length; i2++) {
				 System.out.print(a[i1][i2] + "\t");
			}
			System.out.print("\r\n");
		}
	}

}
