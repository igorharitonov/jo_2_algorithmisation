/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */
package jo_2_algorithmisation;

public class OneDimensionArrayTask6 {

	public static void main(String[] args) {
		double[] a;
		int size;
		double count = 0;
		
		size = OneDimensionArrayCreation.returnSize();
		a = OneDimensionArrayCreation.doubleArrayCreation(size);
		
		printArray(a);
		
		System.out.println("\r\nНомера элементов, являющиеся простыми числами:");
		for (int i = 0; i < size; i++) {
			if ((i != 1) && (i > 0)) {
				if ((i == 2) || (i % 2 != 0)) {
					if ((i == 3) || (i % 3 != 0)) {
						if ((i == 5) || (i % 5 !=0)) {
							if ((i == 7) || (i % 7 != 0)) {
								count = count + a[i];
								System.out.print(i + "\t");
							}
						}
					}
				}
			}
		}
		System.out.println("\r\nСумма искомых чисел: " + count);
	}
	
	private static void printArray(double[] a) {
		System.out.print("Заданный массив:\r\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
