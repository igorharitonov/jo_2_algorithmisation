/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
package jo_2_algorithmisation;

public class MultiArrayTask3 {

	public static void main(String[] args) {
		int[][] a;
		int[] size;
		int p;
		int k;
		
		size = MultiArrayCreation.returnSize();
		a = MultiArrayCreation.wholeMultiArrayCreation(size);
		System.out.println("Введите номер строки ...");
		k = OneDimensionArrayTask1.inputFromConsole();
		System.out.println("Введите номер столбца ...");
		p = OneDimensionArrayTask1.inputFromConsole();
		
		MultiArrayCreation.MultiArrayOutput(a);
		System.out.println("Вывод строки к = " + k + ": ");
		for (int row: a[k]) {
			System.out.print(row + "\t");
		}
		System.out.println("\r\nВывод столбца р = " + p + ": ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i][p] + "\t");
		}	
	}
}
