import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] twoArr = new int[10][];
        for (int i = 0; i < twoArr.length; i++) {
            twoArr[i] = new int[i + 1];
        }
        for (int i = 0; i < twoArr.length; i++) {
            for (int j = 0; j < i; j++) {
                twoArr[i][j] = 1;
                if (i > 1 && j >= 1 && j < i - 1) {
                    twoArr[i][j] = twoArr[i - 1][j - 1] + twoArr[i - 1][j];
                }
                System.out.print(twoArr[i][j]);
            }
            System.out.print("\n");
        }

    }
}
