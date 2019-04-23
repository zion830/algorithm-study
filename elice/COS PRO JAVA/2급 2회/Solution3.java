package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	public static int solution(int N, int M) {
        int answer = 0;
        
        for (int i = N; i <= M; i++) {
            if (i % 2 == 0) {
                answer += (i * i);
            }
        }
        
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        int N = 4;
        int M = 7;
        int ret = sol.solution(N, M);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.  
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}
