/*
 * Класс, возвращающий полученный из консоли размер квадратной матрицы
 */
package jo_2_algorithmisation;

import java.util.Scanner;

public class MultiArrayReturnSizeNonStatic {
	int size;
	
	MultiArrayReturnSizeNonStatic() {
		this.size = returnSize();
	}
	
	private int returnSize() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the size of a square matrix (an even natural number that is > 0) >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Input the size of a square matrix (an even natural number that is > 0) >>> ");
		}
		
		size = sc.nextInt();
		if ((size % 2 != 0) || (size == 0)) {
			returnSize(); // Recursion Function
		}
		return size;
	}
}
