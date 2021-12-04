/*
 * Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1,..., an).
 */
package jo_2_algorithmisation;

public class OneDimensionArrayTask8 {

	public static void main(String[] args) {
		int[] a;
		int bNumber;
		int[] b;
		int size;
		int min;
		int countMin;
		
		size = OneDimensionArrayCreation.returnSize();
		a = OneDimensionArrayCreation.wholeArrayCreation(size);
		min = 0;
		countMin = 0;
		bNumber = 0;
		
		System.out.print("Заданный массив:\r\n");
		for (int i = 0; i < size; i++) {
			min = Math.min(min, a[i]);
			System.out.print(a[i] + "\t");
		}
		for (int i = 0; i < size; i++) {
			if (a[i] == min) {
				countMin++;		
			}
		}
		System.out.print("\r\nMin: " + min);
		System.out.print("\r\ncountMin: " + countMin);
		b = new int[size - countMin];
		for (int i = 0; i < size; i++) {
			if (a[i] != min) {
				b[bNumber++] = a[i];		
			}
		}
		System.out.println("\r\nНовый массив: ");
		for (int bPrint: b) {
			System.out.print(bPrint + "\t");
		}
		System.out.print("\r\nРазмер нового массива: " + b.length);

	}
}
