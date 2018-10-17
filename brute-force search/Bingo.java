import java.util.Scanner;

/*
첫째 줄부터 다섯째 줄까지 빙고판에 쓰여진 수가 가장 위 가로줄부터 차례대로 한 줄에 다섯 개씩 빈 칸을 사이에 두고 주어진다.
여섯째 줄부터 열째 줄까지 사회자가 부르는 수가 차례대로 한 줄에 다섯 개씩 빈 칸을 사이에 두고 주어진다.
빙고판에 쓰여진 수와 사회자가 부르는 수는 각각 1부터 25까지의 수가 한 번씩 사용된다.
* */
public class Bingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] array = new int[5][5];
        boolean[][] isSelected = new boolean[5][5];
        boolean [] isBingo = new boolean[12];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < isSelected.length; i++) {
            for (int j = 0; j < isSelected.length; j++) {
                isSelected[i][j] = false;
            }
        }

        int num;
        int count = 0;
        while (true) {
            num = in.nextInt();
            count++;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] == num)
                        isSelected[i][j] = true;
                }
            }

            //가로 검사
            for (int i = 0; i < isSelected.length; i++) {
                for (int j = 0; j < isSelected.length; j++) {
                    if (!isSelected[i][j]) break;

                    if (j == 4) {
                        if (isSelected[i][j]) isBingo[i] = true;
                    }
                }
            }

            //세로 검사
            for (int i = 0; i < isSelected.length; i++) {
                for (int j = 0; j < isSelected.length; j++) {
                    if (!isSelected[j][i]) break;

                    if (j == 4) {
                        if (isSelected[j][i]) isBingo[i + 5] = true;
                    }
                }
            }

            //대각선 검사
            for (int i = 0; i < isSelected.length; i++) {
                if (!isSelected[i][i]) break;
                if (i == 4) {
                    if (isSelected[i][i]) isBingo[10] = true;
                }
            }

            for (int i = 0; i < isSelected.length; i++) {
                if (!isSelected[i][4 - i]) break;
                if (i == 4) {
                    if (isSelected[i][4 - i]) isBingo[11] = true;
                }
            }

            int bc = 0;
            for (int i = 0; i < isBingo.length; i++) {
                if (isBingo[i]) bc++;
            }


            /*for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(isSelected[i][j] ? "O " : "X ");

                    if (j == 4) System.out.println("count : " + bc);
                }
            }*/

            if (bc >= 3) break;
        }

        System.out.println(count);
    }
}
