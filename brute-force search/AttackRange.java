import java.util.Scanner;

/*
* 입력 첫째 줄에는 디펜스 게임의 맵 크기 N이 주어딘다. 맵은 N×N 크기의 2차원 형태이다. (N은 6이상 100이하의 짝수)
둘째 줄에는 유닛이 설치될 위치 X, Y와 유닛의 사거리 R이 주어진다. X는 행의 번호, Y는 열의 번호를 의미한다. (X, Y는 1이상 N이하의 자연수, R은 N/2이하의 자연수)
예제 출력과 같이 유닛의 사거리를 나타내어 출력한다. (유닛의 사거리가 아무리 길어도 맵을 벗어날 수는 없다.)
*/
public class AttackRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;
        int range = in.nextInt();

        int rangeX, rangeY;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rangeX = x - i;
                rangeY = y - j;

                if (rangeX == 0 && rangeY == 0)
                    System.out.print("x ");
                else if (rangeX > 0 && rangeX <= range && rangeY == 0)
                    System.out.print(rangeX + " ");
                else if (rangeX < 0 && rangeX >= (range * -1) && rangeY == 0)
                    System.out.print((rangeX * -1) + " ");
                else if (rangeX == 0 && rangeY <= range && rangeY > 0)
                    System.out.print(rangeY + " ");
                else if (rangeX == 0 && rangeY < 0 && rangeY >= (range * -1))
                    System.out.print((rangeY * -1) + " ");
                else if (rangeX >= 1 && rangeY >= 1 && rangeX + rangeY <= range)
                    System.out.print((rangeX + rangeY) + " ");
                else if (rangeX >= 1 && rangeY <= -1 && rangeX + (rangeY * -1) <= range)
                    System.out.print((rangeX + rangeY * -1) + " ");
                else if (rangeX <= -1 && rangeY >= 1 && (rangeX * -1) + rangeY <= range)
                    System.out.print((rangeX * -1 + rangeY) + " ");
                else if (rangeX <= -1 && rangeY <= -1 && (rangeX + rangeY) * -1 <= range)
                    System.out.print(((rangeX + rangeY) * -1) + " ");
                else
                    System.out.print("0 ");
            }
            if (i != n - 1) System.out.println();
        }
    }
}
