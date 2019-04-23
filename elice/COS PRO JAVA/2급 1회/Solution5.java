package elice;

import elice.EliceUtils;
import java.util.*;

class Main {
    public static int[] solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }
        return arr;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {1, 4, 2, 3};
        int[] ret = sol.solution(arr);
 
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + Arrays.toString(ret) + " �Դϴ�.");
    }
}