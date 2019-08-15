public class Solution {
    boolean solution(String s) {
        int countP = 0, countY = 0;

        for (int i = 0; i < s.length(); i++) {
            char spell = s.charAt(i);

            if (spell == 'p' || spell == 'P') {
                countP++;
            } else if (spell == 'y' || spell == 'Y') {
                countY++;
            }
        }

        return countP == countY;
    }
}
