/*
 * ћагическим квадратом пор¤дка n называетс¤ квадратна¤ матрица размера nxn, составленна¤ из чисел 1, 2, 3,
 * ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
 * собой. ѕостроить такой квадрат. ѕример магического квадрата пор¤дка 3:
 * 6 1 8
 * 7 5 3
 * 2 9 4
 */
package jo_2_algorithmisation;

import java.util.Scanner;
import java.util.Arrays;

public class MultiArrayTask16 {

	public static void main(String[] args) {
		int size;
		int j;
		int floor;
		int[][] a;
		int[][] b;
		int sum;
		
		size = returnSize();
		
		a = new int[(size/2) * 2 + size][];
		b = new int[(size/2) * 2 + size][(size/2) * 2 + size];
		floor = (size / 2) * 2;
		j = 1;
		sum = 0;
		
		/* —оздаем зубчатый ("рваный") массив со значени¤ми по умолчанию */
		for (int i = 0; i < a.length; i++) {
				a[i] = new int[j];
				if (i < (int) a.length / 2) {
					j += 2;
				} else if (i >= (int) a.length / 2) {
					j -= 2;
				}
		}
		
		/* «аполн¤ем первую колонку массива стартовыми значени¤ми, натуральными числами от 1 до п */
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				if (k == 0) {
					if ((size - i) >= 1) {
						a[i][k] = size - i;
					} else {
						a[i][k] = a[i - 1][k] + size;
					}
				}
			}
		}
		
		/* «аполн¤ем оставшиес¤ колонки массива значени¤ми, вычисл¤емыми на основе стартовых */
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				if ((k != 0) && (k % 2 == 0)) {
					a[i][k] = a[i][k - 2] + size + 1;
				}
			}
		}
		
		/* «аполн¤ем оставшиес¤ колонки массива значени¤ми, вычисл¤емыми на основе стартовых */
		for (int i = 0; i < a.length; i++) {
			a[i] = Arrays.copyOf(a[i],(size/2) * 2 + size);
		}
		
		/* «аполн¤ем оставшиес¤ колонки массива значени¤ми, вычисл¤емыми на основе стартовых */
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				if (a[i][k] != 0) {
					b[i][k + floor] = a[i][k];
					//System.out.println(a[i][k] + "==" + floor);
					}
			}
			if((i < a.length / 2)) {
				floor--; 
			} else if ((floor == 0) || (i > a.length / 2)){
				floor++;
			}
		}
		
		a = b;
		
		/* «аполн¤ем дополнительную матрицу, куда включим значени¤ террас*/
		for (int i = 0; i < a.length; i++ ) {
			if ((i < (int) size / 2)) {
				for (int k = 0; k < a[i].length; k++) {
					if (a[i][k] != 0) {
						a[i + size][k] = a[i][k];
						a[i][k] = 0;
					}
				}
			} else if ((i >= size + (int) size / 2)) {
				for (int k = 0; k < a[i].length; k++) {
					if (a[i][k] != 0) {
						a[i - size][k] = a[i][k];
						a[i][k] = 0;
					}
				}
			}
		}
		
		// Po stroke
		/* «аполн¤ем оставшиес¤ колонки массива значени¤ми, вычисл¤емыми на основе стартовых */
		/* «аполн¤ем дополнительную матрицу, куда включим значени¤ террас*/
		for (int i = 0; i < a.length; i++ ) {
				for (int k = 0; k < a[i].length; k++) {
					if ((k < (int) size / 2)) {
						if (a[i][k] != 0) {
							a[i][k + size] = a[i][k];
							a[i][k] = 0;
						}
					} else if ((k >= size + (int) size / 2)) {
						if (a[i][k] != 0) {
							a[i][k - size] = a[i][k];
							a[i][k] = 0;
						}
					}
				}
		}
		
		b = new int[size][size];
		for (int i = 0; i < a.length; i++) {
			 if ((i >= size / 2) && (i < a.length - (size / 2))) {
				 b[i - size / 2] = Arrays.copyOfRange(a[i], size / 2, a.length - size / 2);
			 }
		 }
		
		//printArray(a);
		System.out.println();
		printArray(b);
		
		for (int[] row: b) {
			for (int elem: row) {
				sum += elem;
			}
			System.out.println("ѕо строке: " + sum);
			sum = 0;
		}
		
		for (int k = 0; k < b.length; k++) {
			for (int i = 0; i < b.length; i++) {
				sum += b[i][k];
			}
			System.out.println("ѕо столбцу: " + sum);
			sum = 0;
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int k= 0; k < b.length; k++) {
				if (i == k) {
					sum += b[i][k];
				}
			}
		}
		System.out.println("ѕо диагонали: " + sum);
	}
	
	private static int returnSize() {
		int size;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¬ведите пор¤док магического квадрата (нечетное число, кроме 1 и не больше 15) >>> n = ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("¬ведите пор¤док магического квадрата (нечетное число, кроме 1 и не больше 15)  >>> n =");
		}
		size = sc.nextInt();
		if ((size == 1) || (size % 2 == 0) || (size == 0) || (size > 15)) {
			returnSize();
		}
		
		return size;
	}
	
	private static void printArray(int[][] a) {
		for (int[] row: a) {
			for(int elem: row) {
				System.out.print(elem + "\t");
			}
			System.out.println();
		}
	}

}
