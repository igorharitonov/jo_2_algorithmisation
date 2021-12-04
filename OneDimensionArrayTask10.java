/*
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
package jo_2_algorithmisation;

public class OneDimensionArrayTask10 {

	public static void main(String[] args) {
		int[] a;
		int size;
		
		size = OneDimensionArrayCreation.returnSize();
		a =  OneDimensionArrayCreation.wholeArrayCreation(size);
		
		System.out.println("The old array || The new array");
		for (int i = 0; i < size; i++) {
			if((i + 1) % 2 == 0) {
				System.out.print(a[i] + "\t||\t");
				a[i] = 0;
				System.out.print(a[i] + "\r\n");
			} else {
				System.out.print(a[i] + "\t||\t" + a[i] + "\r\n");
			}
		}
	}
}
