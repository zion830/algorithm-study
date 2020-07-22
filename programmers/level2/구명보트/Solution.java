import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int left = 0;
        int right;

        for (right = people.length - 1; left <= right; right--) {
            answer++;
            if (people[right] + people[left] <= limit) {
                left++;
            }
        }

        return answer;
    }
}
