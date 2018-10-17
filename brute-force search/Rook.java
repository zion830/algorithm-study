import java.util.Scanner;

/*
* 현재 체스판의 상태가 주어져 있고, 다음 차례가 상대의 차례일 때, 킹이 룩에게 잡힐 가능성이 있는지 알아보자.
* 8줄에 걸쳐 8x8 체스판의 상태가 주어진다. 이때 0은 기물이 없는 상태이고,
* 1은 알랩이의 킹을 의미하고, 2는 상대의 룩을 의미하며 3은 그 외 다른 기물들을 의미한다. (
* 킹은 하나만 존재하며, 상대의 룩은 최대 2개까지 있을 수 있다. 그 외 기물들은 최대 29개까지 있을 수 있다.)
* */
public class Rook {
    static final int KING = 1;
    static final int ROOK = 2;
    static final int OTHER = 3;
    static final int BOARD_SIZE = 8;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resultOK = 0, kingX = 0, kingY = 0;

        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = in.nextInt();
                if (board[i][j] == KING) {
                    kingY = i;
                    kingX = j;
                }
            }
        }

        //좌 -> 우 검사
        boolean rookExist = false;

        for (int i = 0; i < kingX; i++) {
            if (board[kingY][i] == ROOK) {
                rookExist = true;
//                System.out.println("좌 -> 우에서 룩 발견");
            }

            if (rookExist && board[kingY][i] == OTHER) {
                rookExist = false;
//                System.out.println("장애물 발견 1");
            }
        }

        if (rookExist) resultOK += 1;
        rookExist = false;

        //상 -> 하 검사
        for (int i = 0; i < kingY; i++) {
            if (board[i][kingX] == ROOK) {
                rookExist = true;
//                System.out.println("상 -> 하에서 룩 발견");
            }

            if (rookExist && board[i][kingX] == OTHER) {
                rookExist = false;
//                System.out.println("장애물 발견 2");
            }
        }

        if (rookExist) resultOK += 1;
        rookExist = false;

        //우 -> 좌 검사
        for (int i = BOARD_SIZE - 1; i > kingX; i--) {
            if (board[kingY][i] == ROOK) {
                rookExist = true;
//                System.out.println("우 -> 좌에서 룩 발견");
            }

            if (rookExist && board[kingY][i] == OTHER) {
                rookExist = false;
//                System.out.println("장애물 발견 3");
            }
        }

        if (rookExist) resultOK += 1;
        rookExist = false;

        //하 -> 상 검사
        for (int i = BOARD_SIZE - 1; i > kingY; i--) {
            if (board[i][kingX] == ROOK) {
                rookExist = true;
//                System.out.println("하 -> 상에서 룩 발견");
            }

            if (rookExist && board[i][kingX] == OTHER) {
                rookExist = false;
//                System.out.println("장애물 발견 4");
            }
        }

        if (rookExist) resultOK += 1;

        if (resultOK > 0) {
            resultOK = 1;
        } else {
            resultOK = 0;
        }

        System.out.println(resultOK);
    }
}

