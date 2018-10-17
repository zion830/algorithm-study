import java.util.Scanner;

/*
* 영수는 1에서 9까지의 서로 다른 숫자 세 개로 구성된 세 자리 수를 마음속으로 생각한다. (예: 324)
* 민혁이는 1에서 9까지의 서로 다른 숫자 세 개로 구성된 세 자리 수를 영수에게 묻는다. (예: 123)
* 민혁이가 말한 세 자리 수에 있는 숫자들 중 하나가 영수의 세 자리 수의 동일한 자리에 위치하면 스트라이크 한 번으로 센다.
* 숫자가 영수의 세 자리 수에 있긴 하나 다른 자리에 위치하면 볼 한 번으로 센다. 예) 영수가 324를 갖고 있으면
* 429는 1 스트라이크 1 볼이다.
* 241은 0 스트라이크 2 볼이다.
* 924는 2 스트라이크 0 볼이다.
영수는 민혁이가 말한 수가 몇 스트라이크 몇 볼인지를 답해준다. 민혁이가 영수의 세 자리 수를 정확하게 맞추어 3 스트라이크가 되면 게임이 끝난다.
아니라면 민혁이는 새로운 수를 생각해 다시 영수에게 묻는다. 현재 민혁이와 영수는 게임을 하고 있는 도중에 있다.
민혁이가 영수에게 어떤 수들을 물어보았는지, 그리고 각각의 물음에 영수가 어떤 대답을 했는지가 입력으로 주어진다.
이 입력을 바탕으로 여러분은 영수가 생각하고 있을 가능성이 있는 수가 총 몇 개인지를 알아맞혀야 한다.
*/
public class Baseball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int result, resultCount = 0;

        int[] inputNum = new int[count];
        int[] strick = new int[count];
        int[] ball = new int[count];

        for (int i = 0; i < count; i++) {
            inputNum[i] = in.nextInt();
            strick[i] = in.nextInt();
            ball[i] = in.nextInt();
        }

        for (int candidate = 101; candidate < 998; candidate++) {
            result = 0;
            int[] candidateArray = new int[]{candidate / 100, candidate % 100 / 10, candidate % 10};

            if (candidateArray[0] != candidateArray[1] && candidateArray[1] != candidateArray[2] && candidateArray[0] != candidateArray[2]
                    && candidateArray[0] != 0 && candidateArray[1] != 0 && candidateArray[2] != 0) {
                for (int j = 0; j < count; j++) {
                    int s = 0, b = 0;

                    //스트라이크의 개수
                    if (inputNum[j] / 100 == candidateArray[0]) s++;
                    if (inputNum[j] % 100 / 10 == candidateArray[1]) s++;
                    if (inputNum[j] % 10 == candidateArray[2]) s++;

                    //볼의 개수
                    for (int i = 0; i < 3; i++) {
                        if (i != 0 && candidateArray[i] == inputNum[j] / 100) b++;
                        else if (i != 1 && candidateArray[i] == inputNum[j] % 100 / 10) b++;
                        else if (i != 2 && candidateArray[i] == inputNum[j] % 10) b++;
                    }

                    if (s == strick[j] && b == ball[j]) result++;
                }
            }
            if (result == count) resultCount++; //정답의 갯수
        }

        System.out.println(resultCount);
    }
}
