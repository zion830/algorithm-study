import java.util.Scanner;

/*
* 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
* */

public class Gcdlcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lcm = 0;
        int gcd = 0;

        int n = in.nextInt();
        int m = in.nextInt();

        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }

        for (int i = 1; i <= m; i++) {
            if (m % i == 0 && n % i == 0 && i > lcm) lcm = i;
        }


        gcd = n;

        while (true) {
            if (gcd % n == 0 && gcd % m == 0) break;
            gcd++;
        }

        System.out.println(lcm);
        System.out.println(gcd);
    }
}
