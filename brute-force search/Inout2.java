import java.util.Scanner;

/*
* 뒤집기 게임의 룰은 다음과 같다.
뒤집기 게임을 진행할 맵과 뒤집기 횟수 N이 주어진다.
뒤집기 행위는 뒤집을 원소가 1이면 0으로 만들고, 0이면 1로 만든다는 뜻이다.
첫번째 뒤집을 때는 1행의 원소들과 1열의 원소들을 모두 뒤집는다.
두번째 뒤집을 때는 2행의 원소들과 2열의 원소들을 모두 뒤집는다. 마찬가지로 i번째 뒤집을 때는 i행의 원소들과 i열의 원소들을 모두 뒤집는다.
이렇게 총 N번의 뒤집기를 한다. (행과 열의 번호는 1번부터 시작한다.)
10×10크기 맵의 상태와 N이 주어졌을 때 뒤집기 게임을 모두 시행하고 난 뒤의 맵을 출력하는 프로그램을 작성해보자
*/
public class Inout2 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Scanner in = new Scanner(System.in);

        int num = in.nextInt() - 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = in.nextInt();
            }
        }

        System.out.println();

        for (int k = 0; k < num + 1; k++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (j == k || i == k)
                        array[i][j] = (array[i][j] == 1) ? 0 : 1;
                }
            }
        }

        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");

                if (j == 9) System.out.println();
            }
        }
    }
}
