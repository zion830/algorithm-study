import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private int[][] areas; // 인접행렬

    public BFS(int[][] areas) {
        this.areas = areas;
    }

    public String search(int start, int end) {
        String path = "";
        Queue<Node> queue = new LinkedList<>();
        boolean[] visitStatus = new boolean[areas.length];

        try {
            queue.add(new Node(start, path));

            while (!queue.isEmpty()) {
                Node queueVal = queue.poll();

                if (queueVal.num == end) {
                    path = queueVal.path;
                    break;
                }

                for (int i = 0; i < areas.length; i++) {
                    if (areas[queueVal.num][i] == 1 && !visitStatus[i]) {
                        queue.add(new Node(i, queueVal.path));
                        visitStatus[i] = true;
                    }
                }
            }
        } catch (IllegalStateException e) {
            path = "-1";
        }

        return path;
    }

    private class Node {
        private int num;
        private String path;

        Node(int num, String path) {
            this.num = num;
            this.path = path.equals("") ? ("" + num) : (path + " " + num);
        }
    }
}
