import java.util.Scanner;

/*
* 주어진 숫자들 중 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
* */
public class FindPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[] num = new int[size];
        int result = 0;

        for (int i = 0; i < size; i++) {
            num [i] = in.nextInt();
            if (isPrime(num[i])) {
                result++;
            }
        }

        System.out.println(result);
    }

    static boolean isPrime(int num) {
        boolean isPrime = true;

        if (num == 1) return false;
        else if (num == 2) return true;
        else {
            out:
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break out;
                }
            }
            return isPrime;
        }
    }
}
