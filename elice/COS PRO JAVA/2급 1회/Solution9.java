package elice;

import java.io.*;
import java.util.*;
import elice.EliceUtils;

public class Main {
	public static String solution(String characters){
		String result = "";
		result += characters.charAt(0);
		for (int i = 1; i < characters.length(); i++) {
			if (characters.charAt(i - 1) != characters.charAt(i))
				result += characters.charAt(i);
		}
		return result;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Main sol = new Main();
        String characters = "senteeeencccccceeee";
        String ret = sol.solution(characters);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
