/*
 * ������� 10x20 ��������� ���������� ������� �� 0 �� 15. ������� �� ����� ���� ������� � ������ �����, �
 * ������� ����� 5 ����������� ��� � ����� ���
 */
package jo_2_algorithmisation;

import java.util.Random;

public class MultiArrayTask11 {
	private static int[][] a;
	private static int[] size;
	
	static {
		size = new int[]{10, 20};
	}

	public static void main(String[] args) {
		int countFive;
		
		countFive = 0;
		a = createArray(size);
		
		printArray(a);
		System.out.println("������ �����, � ������� ����� 5 ����������� ��� � ����� ���: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] == 5) {
					countFive++;
				}
			}
			if (countFive >= 3) {
				System.out.print((i + 1) + "\t");
			}
			countFive = 0;
		}
		

	}
	
	private static int[][] createArray(int[] size) {
		a = new int[size[0]][size[1]];
		Random r = new Random();
		
		for (int i = 0; i < size[0]; i++) {
			for (int j = 0; j < size[1]; j++) {
				a[i][j] = r.nextInt(15);
			}
		}
		
		return a;
	}
	
	private static void printArray(int[][] a) {
		System.out.println("�������� �������: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
