package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	public static int solution(int number) {
        int count = 0;
        while(number > 0){
            int n = number % 10;
            if (n == 2 || n == 3 || n == 5 || n == 7)
                count += 1;
            number /= 10;
        }
        return count;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
        Main sol = new Main();
        int number = 29022531;
        int ret = sol.solution(number);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}
