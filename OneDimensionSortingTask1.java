/*
 * «аданы два одномерных массива с различным количеством элементов и натуральное число k. ќбъединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не использу¤
 * дополнительный массив.
 */
package jo_2_algorithmisation;

import java.util.Arrays;

public class OneDimensionSortingTask1 {

	public static void main(String[] args) {
		int[] a;        // ѕервый массив
		int[] b;        // ¬торой массив
		int k;
		int aOldLength; // —охранение первоначальной длины первого массива

		a = new int[] { 23, 56, 7, 1, 2, 9, 67, 90 };
		b = new int[] { 2, 54, 90, 11, 5 };
		k = 4;
		aOldLength = a.length;
		printArray(a, "ѕервый массив: ");
		printArray(b, "¬торой массив: ");
		System.out.println("„исло к: " + k);
		
		a = Arrays.copyOf(a, a.length + b.length);
		
		/* —двиг части первого массива на между элементом к и к + 1 на длину второго массива */
		for (int i = 0; i < a.length; i++) {
			if ((i >= (k + 1)) && (i < aOldLength)) {
				a[i + b.length] = a[i];
				a[i] = 0;
			}
		}
		
		/* ¬ставка второго массива в первый в образовавшийс¤ проем */
		for (int i = k + 1, j = 0; j < b.length; i++, j++) {
			a[i] = b[j];
		}
		printArray(a, "»тоговый массив: ");
	}
	
	/* ћетод дл¤ вывода массива на экран */
	private static void printArray(int[] a, String msg) {
		System.out.println(msg);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

}
