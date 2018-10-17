import java.util.ArrayList;
import java.util.Scanner;

/*
* 어떤 수열의 연속한 세개의 숫자가 주어졌을 때, 이 수열이 등차수열인지 등비수열인지를 구분한 후, 다음 항을 구하라
* */
public class NextNum {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int zeroCount = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();

            arrayList.add(n);
            count++;

            if (n == 0) zeroCount++;
            else if (zeroCount > 0) {
                zeroCount = 0;
            }

            if (zeroCount == 3) break;
        }

        count = count / 3 - 1;

        for (int i = 0; i < count; i++) {
            //등차 수열일 경우
            if ((arrayList.get(i * 3 + 1) - arrayList.get(i * 3)) == (arrayList.get(i * 3 + 2) - arrayList.get(i * 3 + 1))) {
                int sub = arrayList.get(i * 3 + 1) - arrayList.get(i * 3);
                System.out.println("AP " + (arrayList.get(i * 3 + 2) + sub));
            }
            //등비 수열일 경우
            else {
                int sub = arrayList.get(i * 3 + 1) / arrayList.get(i * 3);
                System.out.println("GP " + (arrayList.get(i * 3 + 2) * sub));
            }
        }
    }
}
