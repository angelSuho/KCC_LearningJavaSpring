package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// �������� ����
		// ����, ����, ���� ������ Ű����κ��� �Է¹ް�
		// ������ ����� ����ϼ���. (��, ����� �Ǽ���)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է�: ");
		int language = Integer.parseInt(sc.nextLine());
		System.out.print("���� ���� �Է�: ");
		int english = Integer.parseInt(sc.nextLine());
		System.out.print("���� ���� �Է�: ");
		int math = Integer.parseInt(sc.nextLine());
		
		int sum = language + english + math;
		float average = sum / 3f;
		int averageInt = (int) (sum / 3f);
		System.out.println("����: " + sum);
		System.out.println("���: " + averageInt);
		byte d = 10;
		int a = 1 + d;
		byte qwe = (byte) (d + d);
		float b = d  +a;
	}

}
