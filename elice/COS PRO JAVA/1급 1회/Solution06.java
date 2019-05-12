package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	public int solution(String pos) {
        int [] positions = new int[]{-2, -1, 1, 2};
        int answer = 0;
        
        int x = pos.charAt(0) - 64;
        int y = pos.charAt(1) - '0';
        
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions.length; j++) {
            int tempX = x + positions[i];
            int tempY = y + positions[j];
            
            int check = positions[i] * positions[j];
            if (!(check == 4 || check == -4 || check == -1 || check == 1)) {
                if ((tempX < 9) && (tempX > 0) && (tempY < 9) && (tempY > 0))    {
                    answer++;
                    }   
                }
              }
        }
        
    	return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String pos = "A7";
        int ret = sol.solution(pos);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
