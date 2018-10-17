import java.util.ArrayList;
import java.util.Scanner;

/*
베르트랑-체비쇼프 정리는 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
이 명제는 조제프 베르트랑(Joseph Louis François Bertrand, 1822–1900)이 1845년에 추측했고, 파프누티 체비쇼프(Пафнутий Львович Чебышёв, 1821–1894)가 1850년에 증명했다.
예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
 */
public class Chebyshevtheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n, count;

        while (true) {
            n = scanner.nextInt();

            if (n == 0) break;
            else arrayList.add(n);
        }

        boolean exist = true;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == 1) System.out.println("1");
            else {
                count = 0;

                for (int k = arrayList.get(i) + 1; k < 2 * arrayList.get(i); k++) {
                    for (int j = 2; j < k; j++) {
                        if (k % j == 0) {
                            exist = false;
                            break;
                        } else {
                            exist = true;
                        }
                    }
                    if (exist) {
                        count++;
                    }
                }

                System.out.println(count);
            }
        }
    }
}
