package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	public static int solution(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++)
		    if (650 <= scores[i] && scores[i] < 800) 
			    count += 1;
        return count;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
        int ret = sol.solution(scores);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}
