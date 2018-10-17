import java.util.Scanner;

/*
입력에서 주어진 순서에 따라 N장의 색종이를 평면에 놓았을 때,
입력에서 주어진 순서대로 각 색종이가 보이는 부분의 면적을 한 줄에 하나씩 하나의 정수로 출력한다.
만약 색종이가 보이지 않는다면 정수 0을 출력한다.
*/
public class ColorPaper {
    public static int SIZE = 101;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int[][] array = new int[SIZE][SIZE];
        int[][] papers = new int[count][4];
        int[] papersArea = new int[count];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 4; j++) {
                papers[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[i][j] = 0;
            }
        }

        for (int i = 0; i < count; i++) {
            int startX = papers[i][0];
            int startY = papers[i][1];
            int endX = startX + papers[i][2];
            int endY = startY + papers[i][3];

            for (int j = startX; j < endX; j++) {
                for (int k = startY; k < endY; k++) {
                    array[j][k] = 1;
                }
            }
        }

        //색종이 제거
        for (int i = count - 1; i >= 0; i--) {
            int startX = papers[i][0];
            int startY = papers[i][1];
            int endX = startX + papers[i][2];
            int endY = startY + papers[i][3];

            for (int j = startX; j < endX; j++) {
                for (int k = startY; k < endY; k++) {
                    if (array[j][k] == 1) {
                        papersArea[i]++;
                        array[j][k] = 0;
                    }
                }
            }
        }

        /*for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(array[i][j] + " ");
            }
        }*/

        for (int i = 0; i < count; i++) {
            System.out.println(papersArea[i]);
        }
    }
}
