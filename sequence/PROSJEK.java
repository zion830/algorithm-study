import java.util.Scanner;

/*
* 홍준이는 심심해서 수열을 가지고 놀고 있다. 먼저, 정수 수열 A를 쓴다. 그리고 그 아래에 정수 수열 A의 해당 항까지의 평균값을 그 항으로 하는 정수 수열 B를 쓴다.
예를 들어, 수열 A가 1, 3, 2, 6, 8이라면, 수열 B는 1/1, (1+3)/2, (1+3+2)/3, (1+3+2+6)/4, (1+3+2+6+8)/5, 즉, 1, 2, 2, 3, 4가 된다.
수열 B가 주어질 때, 홍준이의 규칙에 따른 수열 A는 뭘까?
*/
public class PROSJEK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] array2 = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            array2[i] += array[i] * (i + 1);
        }

        for (int i = size - 1; i >= 0; i--) {
            if (i == 0) array2[i] = array[i];
            else {
                array2[i] = array2[i] - array2[i - 1];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
