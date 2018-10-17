import java.util.Scanner;

/*
* 각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
* 첫째 줄에는 반의 학생 수를 나타내는 정수가 주어진다. 학생 수는 3 이상 1000 이하이다.
* 둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다.
* 주어지는 정수는 모두 1 이상 9 이하의 정수이다.
* */
public class ClassPresident {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student = scanner.nextInt();
        int president = 0;
        int[][] stuHistory = new int[student][5];

        for (int i = 0; i < stuHistory.length; i++) {
            for (int j = 0; j < 5; j++) {
                stuHistory[i][j] = scanner.nextInt();
            }
        }

        int sameClass = 0;
        int maxSameClass = 0;

        for (int i = 0; i < stuHistory.length; i++) { //i번 학생의
            sameClass = 0;
            for (int k = 0; k < stuHistory.length; k++) {
                out:
                for (int j = 0; j < 5; j++) {
                    if (k != i && stuHistory[i][j] == stuHistory[k][j]) { //본인과는 비교하지 않는다
//                        System.out.println((i + 1) + "번 학생과 " + (k + 1) + "번 학생이 " + (j + 1) + "학년 때");
                        sameClass++;
                        break out;
                    }
                }
            }

//            System.out.println(i + 1 + "번 학생 : " + sameClass);

            if (sameClass > maxSameClass) {
                maxSameClass = sameClass;
                president = i + 1;
            }
        }

        System.out.println(president);
    }
}