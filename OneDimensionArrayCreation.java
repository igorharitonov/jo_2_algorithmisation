/*
 * Создание одномерного массива
*/
package jo_2_algorithmisation;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionArrayCreation {
	
	public static void main(String[] args) {

	}
	
	/* Метод, создающий массив натуральных чисел заданнoго размера */
	static int[] intArrayCreation(int size) {
		int[] a;
		int num;
		Random r = new Random();
		
		a = new int[size];
		
		for (int i = 0; i < size; i++) {
			num = r.nextInt(1000);
			 a[i] =  num < 0 ? Math.abs(num) : num ;
		}
		return a;
	}
	
	/* Метод, создающий массив целых чисел заданнoго размера */
	static int[] wholeArrayCreation(int size) {
		int[] a;
		Random r = new Random();
		
		a = new int[size];
		
		for (int i = 0; i < size; i++) {
			 a[i] = r.nextInt(size) * 2 - size;
		}
		return a;
	}
	
	/* Метод, создающий массив действительных чисел заданнoго размера */
	static double[] doubleArrayCreation(int size) {
		double[] a;
		Random r = new Random();
		Random r2 = new Random();
		double elem;
		
		a = new double[size];
		
		for (int i = 0; i < size; i++) {
			elem = r.nextDouble();
			if (elem != 0) {
				if (r2.nextInt(5) == 2) {
					a[i] = Math.round(elem * size * 2 - size);
				} else { 
					a[i] = elem * size * 2 - size;
				}
			 } else {
				 a[i] = elem;
			 }
		}
		return a;
	}
	
	/* Метод, получающий из консоли размер массива */
	static int returnSize() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите размер массива >>> n = ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите размер массива >>> n =");
		}
		return sc.nextInt(); 
	}

}
