import java.util.Scanner;

public class EvenDigits {

    public static void main(String[] args) {
        int count;
        Scanner in = new Scanner(System.in);

        count = in.nextInt();
        long[] array = new long[count];

        for (int i = 0; i < count; i++) {
            array[i] = in.nextLong();
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Case #" + (i + 1) + ": " + getCount(array[i]));
        }
    }

    public static int getCount(long num) {
        int result = 0;
        int result2 = 0;
        long temp1 = num, temp2 = num;
        while (!allIsEven(temp1)) {
            temp1++;
            result++;
        }

        while (temp2 > 0 && !allIsEven(temp2)) {
            temp2--;
            result2++;
        }

        return (result > result2) ? result2 : result;
    }

    public static boolean allIsEven(long num) {
        boolean allIsEven = true;

        while (num > 0) {
            if ((num % 10) % 2 == 0) {
                num /= 10;
            } else {
                allIsEven = false;
                return allIsEven;
            }
        }

        return allIsEven;
    }
}