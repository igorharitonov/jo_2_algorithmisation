/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */
package jo_2_algorithmisation;

public class MultiArrayTask1 {

	public static void main(String[] args) {
		int[][] a;
		int[] size;
		
		size = MultiArrayCreation.returnSize();
		a = MultiArrayCreation.wholeMultiArrayCreation(size);
		
		MultiArrayCreation.MultiArrayOutput(a);
		
		System.out.println("Отобранные столбцы:");
		for (int i1 = 0; i1 < a.length; i1++) {
			for (int i2 = 0; i2 < a[0].length; i2++) {
				if (((i2 + 1) % 2 != 0) && (a[0][i2] > a[a.length - 1][i2])) {
					System.out.print(a[i1][i2] + "\t");
				} 
			}
			System.out.print("\r\n");
		}
		
	}

}
