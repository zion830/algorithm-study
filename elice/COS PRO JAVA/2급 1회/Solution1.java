package elice;

import java.util.*;
import elice.EliceUtils;

public class Main {
    public static int[] solution(String[] shirtSize) {
        String [] size = { "XS", "S", "M", "L", "XL", "XXL" };
        int[] answer = new int[6];
        
        for (int i = 0; i < shirtSize.length; i++) {
            for (int j = 0; j < size.length; j++) {
                if (shirtSize[i] == size[j]) {
                    answer[j]++;
                    break;
                }
            }
        }
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        int[] ret = sol.solution(shirtSize);
 
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.  
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}
