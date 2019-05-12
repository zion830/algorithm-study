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

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
