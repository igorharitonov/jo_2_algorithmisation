/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[i, j] = sin((Math.pow(i, 2) - Math.pow(j, 2)) / N)
 * и подсчитать количество положительных элементов в ней.
 */
package jo_2_algorithmisation;

public class MultiArrayTask7 {
	private static double[][] a;
	private static int size;

	public static void main(String[] args) {
		int counter;
		MultiArrayReturnSizeNonStatic sizeFromObject = new MultiArrayReturnSizeNonStatic(); // Получение размера матрицы от метода экземпляра внешнего класса
		
		counter = 0;
		size = sizeFromObject.size;
		a = createArray(size);
		
		for (double[] row: a) {
			for (double elem: row) {
				System.out.print("\t" + elem);
				if (elem > 0) {
					counter++;
				}
			}
			System.out.println();
		}
		System.out.println(counter);
	}
	
	private static double[][] createArray(int size) {
		a = new double[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / size);
			}
		}
		return a;
	}
}
