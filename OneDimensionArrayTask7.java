/*
 * Даны действительные числа a1, a2, a3, ..., an. Найти max(a1 + a2n, a2 + a 2n-1, ..., an + an+1)
 * max (a
 */
package jo_2_algorithmisation;

import java.util.Arrays;

public class OneDimensionArrayTask7 {

	public static void main(String[] args) {
		double[] a;
		int size;
		double max;
		//int oldSize;
		
		size = OneDimensionArrayCreation.returnSize();
		a = OneDimensionArrayCreation.doubleArrayCreation(size);
		max = 0;
		
		printArray(a, "Заданный массив:");
		a = Arrays.copyOf(a, 2 * a.length);
//		for (int i = size; i < 2 * size; i++) {
//			a[i] = a[i - size] / 2;
//		}
		printArray(a, "\r\nПерегруженный массив:");
		
		for (int i = 0; i < size; i++) {
			if (Math.max(max, a[i] + a[2 * size - i -1]) != max) {
				max = Math.max(max, a[i] + a[2 * size - i - 1]);
			}
		}
		System.out.println("\r\nMax: \r\n" + max);
		
	}
	
	private static void printArray(double[] a, String msg) {
		System.out.print(msg + "\r\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
