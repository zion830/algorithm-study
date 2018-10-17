import java.util.Scanner;

/*
* 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
소인수란 소수인 인수(약수)를 의미한다.
*/
public class Pfactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int result = 1;
        while (result < num) {
            System.out.println(getMin(num));
            num = num / getMin(num);

            if (num == 1) break;
        }
    }

    static int getMin (int num) { //가장작은 약수를 구한다
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return i;
        }

        return num;
    }
}