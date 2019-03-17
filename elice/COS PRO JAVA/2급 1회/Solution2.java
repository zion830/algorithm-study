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

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
