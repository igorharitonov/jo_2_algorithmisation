/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
*/
package jo_2_algorithmisation;

import java.util.Scanner;

public class OneDimensionArrayTask1 {

	public static void main(String[] args) {
		int[] a;
		int k;
		int sum;
		int size; // Размер массива
		
		size = returnSize();
		a = OneDimensionArrayCreation.intArrayCreation(size); // Вызов метода из другого класса, создающего одномерный массив натуральных чисел
		k = inputFromConsole();
		sum = 0;
		
		printArray(a);
		
		System.out.println("Числа, кратные " + k + ": ");
		for (int i = 0; i < size; i++) {
			if (((a[i] % k) == 0) && (a[i] != 0)) {
				System.out.print(a[i] + ", ");
				 sum += a[i]; 
			 }
		}
		System.out.print("\r\nСумма: " + sum);
	}
	
	static int returnSize() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите количество элементов массива натуральных чисел >>> N = ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите количество элементов массива натуральных чисел >>> N =");
		}
		return sc.nextInt(); 
	}
	
	public static int inputFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите натуральное число >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите натуральное число >>> ");
		}
		return sc.nextInt(); 
	}
	
	private static void printArray(int[] a) {
		System.out.print("Заданный массив:\r\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	
}
