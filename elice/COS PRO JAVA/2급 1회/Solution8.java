package elice;

import java.io.*;
import java.util.*;
import elice.EliceUtils;

public class Main {
	public static boolean solution(String sentence){
        String str = "";
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(c != ' ' && c != '.') str += c;
        }
        int len = str.length();
        for(int i = 0; i < len / 2; i++){
            if(str.charAt(i) != str.charAt(len - 1 - i)) return false;
        }
        return true;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
        Main sol = new Main();
        String sentence1 = "never odd or even.";
        boolean ret1 = sol.solution(sentence1);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
        
        
        String sentence2 = "palindrome";
        boolean ret2 = sol.solution(sentence2);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2+ " �Դϴ�.");       
    }
}
