import java.util.Scanner;

/*
* 테트리스 맵은 가로로 C칸, 세로로 R칸의 C×R격자형 모양이다. 예를 들어보자. 아래 그림은 가로가 6칸, 세로가 6칸인 테트리스 맵의 상태이다.
이때 가로가 1칸이고 세로가 4칸인 1×4 직사가형 작대기 모양의 테트리미노(테트리미노는 항상 1×4)를 왼쪽에서 5번째 칸에 둘 경우 총 세줄의 수평선을 메울 수 있다.
테트리스는 한번에 여러 수평선을 메울수록 큰 점수를 얻는 게임이므로, 위 경우에서는 이 방법이 가장 높은 점수를 얻을 수 있는 방법이다.
윤성이를 도와 작대기 모양 테트리미노를 어디에 두었을 때 가장 높은 점수를 얻을 수 있는지 알려주자.
(윤성이는 작대기 모양 테트리미노가 나왔을때 게임오버를 당할지언정 가로가 더 길도록 눕혀서 두지 않는다는 나름의 테트리스 철학이 있다.)
그리고 테트리스는 무조건 일자로 떨어진다. (오른쪽에서 왼쪽으로 공간을 비집고 들어가는 등의 스킬은 윤성이에겐 존재하지않는다.)
*/
public class Tetris {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();

        int resultX = 0, emptyCount = 0;

        int[] acceptBlock = new int[r];

        //값 입력
        int[][] board = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int heightCount;
        for (int i = 0; i < r; i++) {
            heightCount = 0;

            for (int j = c - 1; j >= 0; j--) {
                if (board[j][i] == 0) heightCount++;
                else heightCount = 0;

                //비어있는 4칸이 연속되는 자리 찾기
                if (heightCount == 4) {
                    acceptBlock[i] = j;
                    break;
                } else acceptBlock[i] = -1;
            }
        }

        int score = 0, maxScore = 0;
        int checkRow;

        for (int i = 0; i < acceptBlock.length; i++) {
            if (acceptBlock[i] != -1) { //4칸 이상 들어갈 자리가 있을 때
                for (int j = acceptBlock[i]; j < acceptBlock[i] + 4; j++) {
                    checkRow = 0;

                    for (int k = 0; k < r; k++) {
                        if (board[j][k] == 1) {
                            checkRow++;
                        }
                    }

                    if (checkRow == r - 1) score++;
                }

                if (maxScore < score) { //가장 높은 점수를 얻는 곳을 x로 설정
                    maxScore = score;
                    resultX = i + 1;
                }
            }
        }

        for (int i = 0; i < acceptBlock.length; i++) {
            if (acceptBlock[i] == -1) emptyCount++;
        }

        if (emptyCount == acceptBlock.length) {
            resultX = 0;
            maxScore = 0;
        }

        if (maxScore == 0) resultX = 0;

        System.out.println(resultX + " " + maxScore);
    }

    public static void printArray(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
