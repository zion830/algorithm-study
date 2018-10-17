import java.util.Scanner;

/*
* 어떤 지점을 클릭했을 때, 주변에 몇개의 지뢰들이 존재하는지를 출력하는 프로그램을 작성해보자
* */
public class Mine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;

        int[][] board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int mineCount = 0;

        if (board[x][y] == 1)
            System.out.println("game over");
        else {
            if (x != 0 && y != 0 && board[x - 1][y - 1] == 1) mineCount++;
            if (y != 0 && board[x][y - 1] == 1) mineCount++;
            if (x != 0 && board[x - 1][y] == 1) mineCount++;
            if (x != n - 1 && board[x + 1][y] == 1) mineCount++;
            if (y != m - 1 && board[x][y + 1] == 1) mineCount++;
            if (x != n - 1 && y != m - 1 && board[x + 1][y + 1] == 1) mineCount++;
            if (x != 0 && y != m - 1 && board[x - 1][y + 1] == 1) mineCount++;
            if (x != n - 1 && y != 0 && board[x + 1][y - 1] == 1) mineCount++;

            System.out.println(mineCount);
        }
    }
}