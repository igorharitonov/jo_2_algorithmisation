/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
package jo_2_algorithmisation;

public class OneDimensionArrayTask5 {

	public static void main(String[] args) {
		int[] a;
		int size;
		
		size = OneDimensionArrayCreation.returnSize();
		a = OneDimensionArrayCreation.wholeArrayCreation(size);
		
		printArray(a);
		
		for (int i = 0; i < size; i++) {
			if (a[i] > i) {
				System.out.println(a[i]);
			}
		}
	}
	
	private static void printArray(int[] a) {
		System.out.print("Заданный массив:\r\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
