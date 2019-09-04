import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int count = 0;
        int answer = 0; // 최대 부서 개수

        for (int i : d) {
            count += i;

            if (count > budget) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }
}
