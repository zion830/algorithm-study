package elice;

import java.io.*;
import java.util.*;
import elice.EliceUtils;

public class Main {
    static int[] func_a(int[] arr){
        int[] counter = new int[1001];
        for(int i = 0; i < arr.length; i++)
            counter[arr[i]]++;
        return counter;
    }
    
    static int func_b(int[] arr){
        int ret = 0;
        for(int i = 0; i < arr.length; i++){
            if(ret < arr[i])
                ret = arr[i];
        }
        return ret;
    }
    
    static int func_c(int[] arr){
        final int INF = 1001;
        int ret = INF;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 && ret > arr[i])
                ret = arr[i];
        }
        return ret;
    }
    public static int solution(int[] arr) {
    
        //아래의 [ 빈칸 ]을 채워주세요.
        int[] counter = func_a(arr);
        int maxCnt = func_b(arr);
        int minCnt = func_c(arr);
        
        return counter[maxCnt] / counter[minCnt];
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {1, 2, 3, 3, 1, 3, 3, 2, 3, 2};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}