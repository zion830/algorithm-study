import java.util.Scanner;

/*
* 위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
*/
public class Beehive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int min = 1, max = 1, result = 1;

        outLoop:
        while (true) {
//            System.out.println("min : " + min + " | max : " + max);
            for (int i = min; i <= max; i++) {
                if (num >= min && num <= max) break outLoop;
            }

            min = max + 1;
            max = min + result * 6 - 1;
            result++;
        }

        System.out.println(result);
    }
}
