import java.util.Scanner;

/*
* 여러분들은 일일 경찰관이 되어 10부제를 위반하는 자동차의 대수를 세는 봉사활동을 하려고 한다.
* 날짜의 일의 자리 숫자가 주어지고 5대의 자동차 번호의 일의 자리 숫자가 주어졌을 때 위반하는 자동차의 대수를 출력하면 된다.
* */

public class Car {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();
        int [] carNum = new int[5];

        for (int i = 0; i < carNum.length; i++) {
            carNum[i] = in.nextInt();
        }

        int count = 0;

        for (int i = 0; i < carNum.length; i++) {
            if (carNum[i] == day) count++;
        }

        System.out.println(count);
    }
}
