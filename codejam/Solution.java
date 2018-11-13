import java.io.*;

public class Solution {

    public static void main(String[] args) {
        try {
            // File file = new File("C:\\Users\\honglab\\Downloads\\A-small-practice.in");
            File file = new File("C:\\Users\\honglab\\Downloads\\A-large-practice.in");
            File output = new File("C:\\Users\\honglab\\Downloads\\output_file.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));

            String line;
            int i = 0;

            while ((line = reader.readLine()) != null) {
                if (i > 0) {
                    if (output.isFile() && output.canRead()) {
                        writer.write("Case #" + i + ": " + i);
                    }
                    writer.newLine();
                }

                i++;
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
