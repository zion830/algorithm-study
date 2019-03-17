package elice;

import elice.EliceUtils;
import java.util.*;

public class Main {
	public static int solution(int price, String grade) {
        int dc = 0;
        switch (grade) {
        case "S" : 
            dc = 5;
            break;
        case "G" :
            dc = 10;
            break;
        case "V" :
            dc = 15;
            break;
        }
        
        int answer = price / 100 * (100 - dc);
        return answer;
    }    

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
        
        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}
