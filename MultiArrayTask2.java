/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
package jo_2_algorithmisation;

public class MultiArrayTask2 {

	public static void main(String[] args) {
		int[][] a;
		int[] size;
		boolean checker;
		
		checker = false;
		
		do {
			size = MultiArrayCreation.returnSize();
			if (size[0] == size[1]) {
				checker = true;
			} else {
				System.out.println("Количество строк и столбцов должно быть равно!");
			}
		} while (checker == false);
		a = MultiArrayCreation.wholeMultiArrayCreation(size);
		
		MultiArrayCreation.MultiArrayOutput(a);
		
		System.out.println("Элементы, стоящие по диагонали: ");
		for (int i1 = 0; i1 < a.length; i1++) {
			for (int i2 = 0; i2 < a[0].length; i2++) {
				 if ((i1 == i2) || (i1 + i2 == a.length - 1)) {
					 System.out.print(a[i1][i2] + "\t");
				 }
			}
			System.out.print("\r\n");
		}
	}

}
