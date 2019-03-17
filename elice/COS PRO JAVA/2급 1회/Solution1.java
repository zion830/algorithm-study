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
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        int[] ret = sol.solution(shirtSize);
 
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.  
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + Arrays.toString(ret) + " �Դϴ�.");
    }
}
