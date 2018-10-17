import java.util.Scanner;

/*
* 준혁이는 양의 정수 N개로 이루어진 수열 A의 정체를 아무에게나 알려주고 싶지 않았다.
* 그래서 준혁이는 수열 A의 모든 두 수의 합만을 적어놓고 이를 S라고 했다. 이 때, 수열 A를 구하는 프로그램을 작성하시오.
* */
public class Sequencesum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            if (i == 0)
                System.out.print(((array[0][1] + array[0][2] - array[1][2]) / 2) + " ");
            else if (i == 1) {
                System.out.print(((array[1][0] + array[1][2] - array[2][0]) / 2) + " ");
            } else {
                System.out.print((array[0][i] + array[1][i] - array[0][1]) / 2 + " ");
            }
        }
    }

}
