import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public boolean solution(String[] phoneBook) {
        List<String> sortedList = Arrays.stream(phoneBook)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        for (int i = 0; i < sortedList.size(); i++) {
            String item = sortedList.get(i);

            for (int j = i + 1; j < sortedList.size() - 1; j++) {
                if (sortedList.get(j).startsWith(item)) {
                    return false;
                }
            }
        }

        return true;
    }
}
