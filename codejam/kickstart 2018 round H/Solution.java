import java.io.*;

// A large
class Solution {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\zion8\\Downloads\\A-large.in");
            File output = new File("C:\\Users\\zion8\\Downloads\\output_file.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));

            int i = 0, index = 0, maxIndex = 0;
            int testCase = 0, caseNum = 1;
            int sq = 0;
            String line;
            String[] array = new String[100];

            while ((line = reader.readLine()) != null) {
                if (i > 0) {
                    if (output.isFile() && output.canRead()) {
                        System.out.println(line);
                        if (index == 0) {
                            String[] numArray = line.split(" ");
                            sq = Integer.parseInt(String.valueOf(numArray[0]));
                            maxIndex = Integer.parseInt(String.valueOf(numArray[1]));
                            array = new String[maxIndex];
                            index++;
                        } else if (index == maxIndex) {
                            array[index - 1] = line;
                            writer.write("Case #" + caseNum + ": " + solution(sq, maxIndex, array));
                            if (caseNum != testCase) writer.newLine();
                            caseNum++;
                            index = 0;
                        } else {
                            array[index - 1] = line;
                            index++;
                        }
                    }
                } else
                    testCase = Integer.parseInt(line);

                i++;
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long solution(int sequence, int fbCount, String[] strs) {
        long result = (long) Math.pow(2, sequence);

        // 선행 문자열이 중복될 경우 제거
        for (int i = 0; i < fbCount; i++) {
            for (int j = i + 1; j < fbCount; j++) {
                if (!strs[i].equals("") && strs[j].length() > strs[i].length()
                        && strs[j].substring(0, strs[i].length()).equals(strs[i])) strs[j] = "";
            }
        }

        // 모든 경우의 수 - 금지 문자열로 발생하는 경우의 수
        for (int i = 0; i < fbCount; i++) {
            if (!strs[i].equals("")) {
                if (strs[i].length() == sequence)
                    result -= 1;
                else
                    result -= (long) Math.pow(2, sequence - strs[i].length());

            }
        }
        return result;
    }
}