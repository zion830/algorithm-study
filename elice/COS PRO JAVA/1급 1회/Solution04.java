package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	public long solution(long num) {
        long temp = num + 1;
        
        while (!checkNum(temp)) {
            temp += 1;
        }
    
        return temp;
    }

    public static boolean checkNum(long num) {
        String string = String.valueOf(num);
        
         for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '0')
                    return false;
            }

        return true;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        long num = 9949999;
        long ret = sol.solution(num);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}
