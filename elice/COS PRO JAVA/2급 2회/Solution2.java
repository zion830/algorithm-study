package elice;

import java.io.*;
import java.util.*;
import elice.EliceUtils;

public class Main {
	public static int func_a(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if (arr[i] % 5 == 0)
                count += 1;
        return count;
    }
    public static String func_b(int three, int five){
        if (three > five)
            return "three";
        else if (three < five)
            return "five";
        else
            return "same";
    }
    
    public static int func_c(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if (arr[i] % 3 == 0)
                count += 1;
        return count;
    }

    public static String solution(int[] arr) {
        int countThree = func_c(arr);
        int countFive = func_a(arr);
        String answer = func_b(countThree, countFive);
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {2, 3, 6, 9, 12, 15, 10, 20, 22, 25};
        String ret = sol.solution(arr);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}
