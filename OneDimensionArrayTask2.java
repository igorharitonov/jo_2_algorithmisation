/* 
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
*/
package jo_2_algorithmisation;

import java.util.Scanner;

public class OneDimensionArrayTask2 {

	public static void main(String[] args) {
		double[] a;
		double z;
		int size;
		int subst;
		
		size = returnSize();
		a = OneDimensionArrayCreation.doubleArrayCreation(size); // Вызов метода из другого класса, создающего одномерный массив действительных чисел
		z = inputFromConsole();
		subst = 0;
		
		printArray(a);
		
		System.out.println("Итоговый массив: ");
		for (int i = 0; i < size; i++) {
			if (a[i] > z) {
				a[i] = z;
			++subst;
			}
			System.out.print(a[i] + "\t");
		}
		System.out.print("\r\nКоличество замен: " + subst);
	}
	
	private static int returnSize() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите размер массива >>> n = ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите размер массива >>> n =");
		}
		return sc.nextInt(); 
	}
	
	private static double inputFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число >>> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите число >>> ");
		}
		return sc.nextDouble(); 
	}
	
	private static void printArray(double[] a) {
		System.out.print("Заданный массив:\r\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

}