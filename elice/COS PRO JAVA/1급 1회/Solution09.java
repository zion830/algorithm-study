package elice;

import java.io.;
import java.util.Scanner;
import elice.EliceUtils;

public class Main {
	public int func(int record){
        if(record == 0) return 1;
        else if(record == 1) return 2;
        return 0;
    }

    public int solution(int[] recordA, int[] recordB){
        int cnt = 0;
        for(int i = 0; i  recordA.length; i++){
            if(recordA[i] == recordB[i])
                continue;
            else if(recordA[i] == func(recordB[i]))
                cnt = cnt + 3;
            else {
                if (cnt  0) cnt = cnt - 1;
                }
        }
        return cnt;
    }

     �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
        int ret = sol.solution(recordA, recordB);

         [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println(solution �޼ҵ��� ��ȯ ����  + ret +  �Դϴ�.);
    }
}
