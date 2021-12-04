/*
 * ����� ������������� �������� ������� ��������� ���������� �������
 */
package jo_2_algorithmisation;

import java.util.Random;
import java.util.Scanner;

public class MultiArrayTask10 {
	static int size;
	static int[][] a;

	public static void main(String[] args) {
		size = returnSize();
		a = createArray(size);
		printArray(a);
		
		System.out.println("������������� �������� ������� ���������: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if ((i == j) && (a[i][j] > 0)) {
					System.out.print(a[i][j] + "\t");
				}
			}
		}
	}

	private static int returnSize() {		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������� ������� ���������� ������� �������  (������ ����������� �����, ������� ����) >>> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("������� ������� ���������� ������� �������  (������ ����������� �����, ������� ����) >>>");
		}
		return sc.nextInt();
	}
	
	private static int[][] createArray(int size) {
		a = new int[size][size];
		Random r = new Random();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				a[i][j] = r.nextInt(1000) - r.nextInt(1000);
			}
		}
		
		return a;
	}
	
	private static void printArray(int[][] a) {
		System.out.println("�������� ������: ");
		for (int[] row: a) {
			for (int elem: row) {
				System.out.print("\t" + elem);
			}
			System.out.println();
		}
	}
}
