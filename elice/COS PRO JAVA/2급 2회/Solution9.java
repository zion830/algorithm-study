package elice;

import java.io.*;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	public static int solution(int[] votes, int N, int K) {
        int[] counter = new int[N + 1];
        for(int i = 0; i < votes.length; ++i)
            counter[votes[i]] += 1;
        int answer = 0;
        for(int i = 0; i <= N; ++i)
            if(counter[i] == K)
                answer += 1;
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] votes = {2, 5, 3, 4, 1, 5, 1, 5, 5, 3};
        int N = 5;
        int K = 2;
        int ret = sol.solution(votes, N, K);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}
