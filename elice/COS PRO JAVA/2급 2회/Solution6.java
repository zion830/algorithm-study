package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	public static int solution(int[] floors) {
        int dist = 0;
        int length = floors.length;
        
        for(int i = 1; i < length; ++i){
            if(floors[i] > floors[i-1])
                dist += floors[i] - floors[i-1];
            else
                dist += floors[i-1] - floors[i];
        }
        return dist;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] floors = {1, 2, 5, 4, 2};
        int ret = sol.solution(floors);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}
