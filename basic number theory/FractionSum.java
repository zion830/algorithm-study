/*
* 분자 분모가 모두 자연수인 두 분수의 합 또한 분자 분모가 자연수인 분수로 표현할 수 있다.
두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오.
기약분수란 더 이상 약분되지 않는 분수를 의미한다.
*/

import java.util.Scanner;

public class FractionSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();

        int mol = n1 * n4 + n2 * n3;
        int den = n2 * n4;

        int gcd = gcd(mol, den);
        System.out.println((mol / gcd) + " " + (den / gcd));
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
