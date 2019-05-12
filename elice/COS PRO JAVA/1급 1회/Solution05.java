package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
    static final int UP = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;
    static final int RIGHT = 4;
    
	public int solution(int n) {
        int answer = 0;
        int status = RIGHT;
        int x = 0, y = 0;
        int [][] array = new int [n][n];
        
        for (int i = 0; i < n * n; i++) {
            if (x == y)
                answer += (i + 1);
                
            switch(status) {
                case UP:
                    y--;
                    
                    if (y == 0)
                        status = RIGHT;
                    break;
                    
                case DOWN:
                    y++;
                    
                    if (y == n - 1)
                        status = LEFT;
                    break;
                    
                case LEFT:
                    x--;
                    
                    if (x == 0)
                        status = UP;
                    break;
                    
                case RIGHT:
                    x++;
                    
                    if (x == n - 1)
                        status = DOWN;
                    break;                    
            }
        } 
        
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}
