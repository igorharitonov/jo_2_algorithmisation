/*
 * Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е.
 * a1<=a2<=...<=an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
package jo_2_algorithmisation;

public class OneDimensionSortingTask5 {

	public static void main(String[] args) {
		int[] a; // Исходный массив
		int index;
		int current;

		a = new int[] { 22, 1, 2, 27, 2, 3, 4, 5, 52, 6, 7, 81, 9, 10, 11, 11, 12, 131, 14, 15, 1, 2, 2, 21, 3, 40, 5, 5, 6, 7, 82, 9, 109, 11, 11, 12, 13, 14, 35  };
		index = 0;
		current = 0;
		
		printArray(a, "Исходный массив: ");
		
		for (int i = 0; i < a.length; i++ ) {
			if (i - 1 >= 0) {
				index = binarySearch(a, a[i], 0, i);
				current = a[i];
				for (int j = i; j >= index && j > 0; j--) {
						a[j] = a[j - 1];
				}
				a[index] = current;
			}
		}
		
		printArray(a, "Итоговый массив: ");
		System.out.println();
	}

	/* Метод бинарного поиска */
	private static int binarySearch(int[] a, int key, int start, int end) {
		int mid;
	    int low;
	    int high;
	    
	    high = end;
	    low = start;
	    mid = 0;

	    while (low <= high) {
	       mid = (low + high) / 2;
	        if (a[mid] < key) {
	            low = mid + 1;
	        } else if (a[mid] > key) {
	            high = mid - 1;
	        } else if (a[mid] == key) {
	            high = mid;
	            break;
	        }
	    }
		 if (high < 0) { high = 0; }
	    return high;
	}
	
	/* Метод для вывода массива на экран */
	private static void printArray(int[] a, String msg) {
		System.out.println(msg);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

}
