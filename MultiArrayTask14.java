/*
 * ������������ ��������� ������� m x n, ��������� �� ����� � ������, ������ � ������ ������� �����
 * ������ ����� ������ �������.
 */
package jo_2_algorithmisation;

import java.util.Random;
import java.util.Scanner;

public class MultiArrayTask14 {
	private static int[] size;
	private static int[][] a;

	public static void main(String[] args) {
		size = returnSize();
		a = createArray(size);
		
		MultiArrayTask13.printArray(a);
	}
	
	static int[][] createArray(int[] size) {
		int[][] a;
		int countOnes;
		int randomElemNumber;

		countOnes = 0;
		randomElemNumber = 0;
		a = new int[size[0]][size[1]];
		
		for (int j = 0; j < size[1]; j++) {
			while (countOnes <= j) {
				randomElemNumber = randomNumber();
				if (a[randomElemNumber][j] == 0) {
					a[randomElemNumber][j] = 1;
					countOnes++;
				}
			}
			countOnes = 0;
		}
		return a;
	}
	
	private static int randomNumber() {
		Random r = new Random();
		
		return r.nextInt(size[0]);
	}
	
	static int[] returnSize() {
		int[] size;
		
		size = new int[2];
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������� ���-�� ����� ������� >>> n = ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("������� ���-�� ����� ������� >>> n =");
		}
		size[0] = sc.nextInt();
		
		System.out.print("������� ���-�� �������� ������� (������� ���� ������ ���������� �����) >>> m = ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("������� ���-�� �������� ������� (������� ���� ������ ���������� �����) >>> m =");
		}
		
		size[1] = sc.nextInt();
		
		while (size[1] > size[0]) {
			System.out.println("�� ����� ���������� �������� �������, ��� ���������� �����!");
			size[1] = returnSize("Call");			
		}
		
		return size;
	}
	
	static int returnSize(String call) {
		int size;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
			
		System.out.print("������� ���-�� �������� ������� (������ ���� ����� ���������� �����) >>> m = ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("������� ���-�� �������� ������� (������ ���� ����� ���������� �����) >>> m =");
		}
		
		size = sc.nextInt();

		return size;
	}

}
