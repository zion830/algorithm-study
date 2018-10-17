import java.util.Scanner;

/*
* 영팔이는 숫작 0과 8의 매력을 사람들에게 전파하기 위해 유리로된 N×M타일에 0과 8들을 잔뜩 써놓았다.
* 이제 영팔이는 0과 8로된 숫자들은 좌우로 뒤집어도 여전히 0과 8들이라는 것을 보여주려고 한다.
* */
public class Eightnine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][m - j - 1];
                array[i][m - j - 1] = temp;
            }
        }

        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            if (i != array.length - 1) System.out.println();
        }
    }
}
