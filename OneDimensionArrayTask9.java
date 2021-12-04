/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.Если таких
 * чисел несколько, то определить наименьшее из них.
 */
package jo_2_algorithmisation;

public class OneDimensionArrayTask9 {

	public static void main(String[] args) {
		int[] a;
		int[] b;
		int size;
		int count;
		int maxCount;
		int maxNumber;
		
		size = OneDimensionArrayCreation.returnSize();
		a = OneDimensionArrayCreation.wholeArrayCreation(size);
		b = a.clone();
		count = 0;
		maxCount = 0;
		maxNumber = 0;
		
		System.out.println("The array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + "\t");
			for (int i2 = 0; i2 < size; i2++) {
				if (b[i2] == a[i]) {
					count++;
				}
			}
			if (count > 1) {
				if ((maxCount != count) && (Math.max(maxCount, count) == count)) {
					maxCount = count;
					maxNumber = a[i];
				} else if (maxCount == count) {
					maxNumber = Math.min(maxNumber, a[i]);
				}
				count = 0;
			}
		}
		System.out.print("\r\nThe oftest number: " + maxNumber);
	}
}
