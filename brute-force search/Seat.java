import java.util.Scanner;

/*
* 어떤 공연장에는 가로로 C개, 세로로 R개의 좌석이 C×R격자형으로 배치되어 있다. 각 좌석의 번호는 해당 격자의 좌표 (x,y)로 표시된다.
* 이 공연장에 입장하기 위하여 많은 사람이 대기줄에 서있다. 기다리고 있는 사람들은 제일 앞에서부터 1, 2, 3, 4, . 순으로 대기번호표를 받았다.
* 우리는 대기번호를 가진 사람들에 대하여 (1,1)위치 좌석부터 시작하여 시계방향으로 돌아가면서 비어있는 좌석에 관객을 순서대로 배정한다. 이것을 좀 더 구체적으로 설명하면 다음과 같다.
먼저 첫 번째 사람, 즉 대기번호 1인 사람은 자리 (1,1)에 배정한다. 그 다음에는 위쪽 방향의 좌석으로 올라가면서 다음 사람들을 배정한다.
만일 더 이상 위쪽 방향으로 빈 좌석이 없으면 오른쪽으로 가면서 배정한다. 오른쪽에 더 이상 빈자리가 없으면 아래쪽으로 내려간다.
그리고 아래쪽에 더 이상 자리가 없으면 왼쪽으로 가면서 남은 빈 좌석을 배정한다. 이 후 왼쪽으로 더 이상의 빈 좌석이 없으면 다시 위쪽으로 배정하고, 이 과정을 모든 좌석이 배정될 때까지 반복한다.
여러분은 공연장의 크기를 나타내는 자연수 C와 R이 주어져 있을 때, 대기 순서가 K인 관객에게 배정될 좌석 번호 (x,y)를 찾는 프로그램을 작성해야 한다.*/
public class Seat { //달팽이 배열
    private static final int DOWN = 0;
    private static final int RIGHT = 1;
    private static final int UP = 2;
    private static final int LEFT = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int r = in.nextInt();
        int order = in.nextInt();

        int limitX = c, limitY = r, count = 0;

        int x = 0, y = -1;

        int direction = 0;

        if (order > c * r) {
            System.out.println(0);
        } else {
            outerLoop:
            while (count <= c * r) {
                if (direction == LEFT || direction == RIGHT) { //좌우 이동
                    for (int j = 0; j < limitX; j++) {
                        if (direction == LEFT) x--;
                        else if (direction == RIGHT) x++;

                        count++;

                        if (count == order) {
                            System.out.println(x + 1 + " " + (y + 1));
                            break outerLoop;
                        }
                    }
                } else { //상하 이동
                    for (int j = 0; j < limitY; j++) {
                        if (direction == UP) y--;
                        else if (direction == DOWN) y++;

                        count++;

                        if (count == order) {
                            System.out.println(x + 1 + " " + (y + 1));
                            break outerLoop;
                        }
                    }
                }

                if (direction == LEFT || direction == RIGHT) limitY--;
                else limitX--;

                direction++;
                if (direction > 3) direction = 0;
            }
        }
    }
}
