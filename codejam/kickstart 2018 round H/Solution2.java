import java.io.*;

// B small
class Solution2 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\zion8\\Downloads\\B-large.in");
            File output = new File("C:\\Users\\zion8\\Downloads\\large-output_file.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));

            String line;
            int sectionCount = 0;
            int i = 0, caseNum = 1, testCase = 0;

            while ((line = reader.readLine()) != null) {
                if (i > 0) {
                    if (output.isFile() && output.canRead()) {
                        if (i % 2 == 0) {
                            writer.write("Case #" + caseNum + ": " + getScore(sectionCount, line));
                            caseNum++;

                            if (caseNum - 1 != testCase) writer.newLine();
                        } else
                            sectionCount = Integer.parseInt(line);
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

    static long getScore(int count, String scores) {
        long wallCount = (count % 2 == 0) ? count / 2 : count / 2 + 1; // 색칠이 가능한 벽의 개수
        long[] scoreArray = new long[count];

        for (int i = 0; i < count; i++)
            scoreArray[i] = Integer.parseInt(String.valueOf(scores.charAt(i)));

        long max = 0;
        long maxIndex = scoreArray.length - wallCount;

        // 연속되는 벽의 누적 점수가 가장 큰 구역을 찾는다.
        for (int index = 0; index <= maxIndex; index++) {
            int sum = 0;
            for (int i = index; i < index + wallCount; i++)
                sum += scoreArray[i];

            if (sum > max) max = sum;
        }

        return max;
    }
}