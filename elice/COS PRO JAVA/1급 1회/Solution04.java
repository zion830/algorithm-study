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
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        long num = 9949999;
        long ret = sol.solution(num);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
