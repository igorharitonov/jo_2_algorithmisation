/*
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

package jo_2_algorithmisation;

public class OneDimensionArrayTask4 {

	public static void main(String[] args) {
		double[] a;
		int size;
		double min;
		double max;
		int minNumber;
		int maxNumber;
		
		size = OneDimensionArrayCreation.returnSize(); // Вызов метода из другого класса, задающего размер массива
		a = OneDimensionArrayCreation.doubleArrayCreation(size); // Вызов метода из другого класса, создающего одномерный массив действительных чисел
		minNumber = maxNumber = 0;
		min = max = 0;
		
		printArray(a);
		
		for (int i = 0; i < size; i ++) {
			min = Math.min(min, a[i]);
			if (min == a[i]) {
				minNumber = i;
			}
			max = Math.max(max, a[i]);
			if (max == a[i]) {
				maxNumber = i;
			}
		}
		System.out.print("\r\nMin = " + min + "\tMax = " + max + "\r\n" );
		for (int i = 0; i < size; i++ ) {
			if (i == minNumber) {
				a[i] = max;
			} else if (i == maxNumber) {
				a[i] = min;
			}
		}
		printArray(a);
		
	}
	
	private static void printArray(double[] a) {
		System.out.print("Массив:\r\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

}
