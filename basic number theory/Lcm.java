import java.util.Scanner;

/*
* 당신은 두 수에 대하여 최소공배수를 구하는 프로그램을 작성 하는 것이 목표이다.
* */
public class Lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();

        if (n > m) {
            long temp = n;
            n = m;
            m = temp;
        }

        System.out.println(lcm(n, m));
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
