import java.util.Scanner;

/*
 *5x5 2차원 배열이 주어질 때 어떤 원소가 상하좌우에 있는 원소보다 작을 때 해당 위치에 * 을 표시하는 프로그램을 작성하시오.
 * 경계선에 있는 수는 상하좌우 중 존재하는 원소만을 비교한다.
 */
public class Offset {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0 && j == 0) {
                    if (array[i + 1][j] > array[i][j] && array[i][j + 1] > array[i][j])
                        System.out.print("* ");
                    else System.out.print(array[i][j] + " ");
                } else if (i == 0 && j == array.length - 1) {
                    if (array[i + 1][j] > array[i][j] && array[i][j - 1] > array[i][j])
                        System.out.print("* ");
                    else System.out.print(array[i][j] + " ");
                } else if (i == array.length - 1 && j == 0) {
                    if (array[i - 1][j] > array[i][j] && array[i][j + 1] > array[i][j])
                        System.out.print("* ");
                    else System.out.print(array[i][j] + " ");
                } else if (i == array.length - 1 && j == array.length - 1) {
                    if (array[i - 1][j] > array[i][j] && array[i][j - 1] > array[i][j])
                        System.out.print("* ");
                    else System.out.print(array[i][j] + " ");
                } else if (i == array.length - 1) {
                    if (array[i - 1][j] > array[i][j] && array[i][j + 1] > array[i][j]
                            && array[i][j - 1] > array[i][j])
                        System.out.print("* ");
                    else System.out.print(array[i][j] + " ");
                } else if (j == array.length - 1) {
                    if (array[i - 1][j] > array[i][j]
                            && array[i + 1][j] > array[i][j] && array[i][j - 1] > array[i][j])
                        System.out.print("* ");
                    else System.out.print(array[i][j] + " ");
                } else if (i == 0) {
                    if (array[i][j + 1] > array[i][j]
                            && array[i + 1][j] > array[i][j] && array[i][j - 1] > array[i][j])
                        System.out.print("* ");
                    else System.out.print(array[i][j] + " ");
                } else if (j == 0) {
                    if (array[i - 1][j] > array[i][j] && array[i][j + 1] > array[i][j]
                            && array[i + 1][j] > array[i][j])
                        System.out.print("* ");
                    else System.out.print(array[i][j] + " ");
                } else {
                    if (array[i - 1][j] > array[i][j] && array[i][j + 1] > array[i][j]
                            && array[i + 1][j] > array[i][j] && array[i][j - 1] > array[i][j])
                        System.out.print("* ");
                    else System.out.print(array[i][j] + " ");
                }

                if (j == 4) System.out.println();
            }
        }
    }
}
