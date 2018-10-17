import java.util.Scanner;

/*
* n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
* */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int[] fiboArray = new int[x + 1];

        if (x == 0) System.out.println(0);
        else {
            fiboArray[0] = 0;
            fiboArray[1] = 1;

            for (int i = 2; i <= x; i++) {
                fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
            }

            System.out.println(fiboArray[x]);
        }
    }
}
