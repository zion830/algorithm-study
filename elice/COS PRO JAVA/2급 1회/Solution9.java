package elice;

import java.io.*;
import java.util.*;
import elice.EliceUtils;

public class Main {
	public static String solution(String characters){
		String result = "";
		result += characters.charAt(0);
		for (int i = 1; i < characters.length(); i++) {
			if (characters.charAt(i - 1) != characters.charAt(i))
				result += characters.charAt(i);
		}
		return result;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
        Main sol = new Main();
        String characters = "senteeeencccccceeee";
        String ret = sol.solution(characters);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}
