import java.util.Scanner;

/*
* n명의 사람중 m명을 순서에 상관없이 뽑는 경우의 수를 조합이라고 하며 nCm으로 나타낸다.
이 조합은 파스칼의 삼각형과 아주 밀접한 관련이 있다고 한다.
n과 m이 주어졌을때 nCm의 값을 출력하는 프로그램을 작성하시오.
*/
public class CombinationPascal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] piramid = new int[n + 1][n + 1];

        if (n == 0 && m == 0) System.out.println(1);
        else {
            piramid[0][0] = 1;
            piramid[1][0] = 1;
            piramid[1][1] = 1;

            for (int i = 2; i < n + 1; i++) {
                for (int j = 0; j < n + 1; j++) {
                    if (j == 0 || j == i) piramid[i][j] = 1;
                    else {
                        piramid[i][j] = piramid[i - 1][j - 1] + piramid[i - 1][j];
                    }
                }
            }

            System.out.println(piramid[n][m]);
        }
    }
}
