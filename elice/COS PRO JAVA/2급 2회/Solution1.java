package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	static final int maxProductNumber = 10;
    
    public static int[] func_a(int[] gloves){
        int[] counter = new int[maxProductNumber + 1];
        
        //�Ʒ� [ ��ĭ ]�� ä���ּ���
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

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] leftGloves = {2, 1, 2, 2, 4};
        int[] rightGloves = {1, 2, 2, 4, 4, 7};
        int ret = sol.solution(leftGloves, rightGloves);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}
