package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	public static int solution(int value, String unit) {
        int converted = 0;
        if (unit.equals("C"))
            converted = (int)(value * 1.8 + 32);
        if (unit.equals("F"))
            converted = (int)(value - 32 / 1.8);
        return converted;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
        Main sol = new Main();
        int value = 527;
        String unit = "C";
        int ret = sol.solution(value, unit);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}