package elice;

import java.io.*;
import java.util.*;
import elice.EliceUtils;

public class Main {
    public static int solution(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			int current = i;
			int temp = count;
			while (current != 0) {
            
				if ((current % 10 != 0) && (current % 10) % 3 == 0){
					count++;
					System.out.print("¦");
				}
				current /= 10;
			}
			if(temp == count)
				System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		return count;
    }

   // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        int number = 40;
        int ret = sol.solution(number);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}