import java.util.Scanner;

/*
* KOI 시에서는 가로수들이 모두 같은 간격이 되도록 가로수를 추가로 심는 사업을 추진하고 있다.
* KOI 시에서는 예산문제로 가능한 한 가장 적은 수의 나무를 심고 싶다.
* 편의상 가로수의 위치는 기준점으로 부터 떨어져 있는 거리로 표현되며, 가로수의 위치는 모두 양의 정수이다.
* 심어져 있는 가로수의 위치가 주어질 때, 모든 가로수가 같은 간격이 되도록 새로 심어야 하는 가로수의 최소수를 구하는 프로그램을 작성하라.
* 단, 추가되는 나무는 기존의 나무들 사이에만 심을 수 있다.
*/
public class StreetTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int result = 0;
        int[] trees = new int[count];

        for (int i = 0; i < count; i++) {
            trees[i] = in.nextInt();
        }

        int gcd = gcd(trees[1] - trees[0], trees[2] - trees[1]);

        for (int i = 2; i < count - 1; i++) {
            gcd = gcd(gcd, trees[i + 1] - trees[i]);
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = trees[i] + gcd; j < trees[i + 1]; j += gcd) {
                if (j != trees[i + 1]) {
                    result++;
                }
            }
        }
        System.out.println(result);
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
