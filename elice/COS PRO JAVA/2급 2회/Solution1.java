package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	static final int maxProductNumber = 10;
    
    public static int[] func_a(int[] gloves){
        int[] counter = new int[maxProductNumber + 1];
        
        //아래 [ 빈칸 ]을 채워주세요
        for(int i = 0; i < gloves.length; i++){
            counter[gloves[i]] = counter[gloves[i]] + 1;
        }
            
        return counter;
    }
    
    public static int solution(int[] leftGloves, int[] rightGloves) {
        int[] leftCounter = func_a(leftGloves);
        int[] rightCounter = func_a(rightGloves);
        int total = 0;
        for(int i = 1; i <= maxProductNumber; i++)
            total += Math.min(leftCounter[i], rightCounter[i]);
        return total;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] leftGloves = {2, 1, 2, 2, 4};
        int[] rightGloves = {1, 2, 2, 4, 4, 7};
        int ret = sol.solution(leftGloves, rightGloves);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
