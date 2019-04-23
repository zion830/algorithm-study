package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	public static String solution(String[] words) {
        String answer = "";
        
        for (String w : words) {
            if (w.length() > 4)
                answer += w;
        }
       
       if (answer.length() == 0)
            answer = "empty";
        
       return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        String[] words1 = {"my", "favorite", "color", "is", "violet"};
        String ret1 = sol.solution(words1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.  
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
        
        String[] words2 = {"yes", "i", "am"};
        String ret2 = sol.solution(words2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.  
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}
