public class Hanoi {
    public static void main(String args[]) {
        int n = 3;
        move(n, 1, 3);
    }

    /**
     * @param num   원반 번호 (1~3)
     * @param start 시작 기둥 (1~3)
     * @param end   목표 기둥 (1~3)
     */
    static void move(int num, int start, int end) {
        int mid = 6 - start - end; // 중간 기둥 번호

        // 1~n-1까지의 원반을 시작 기둥에서 중간 기둥으로 이동
        if (num > 1) {
            move(num - 1, start, mid);
        }

        // 1~n-1까지의 원반을 중간 기둥에서 목표 기둥으로 이동
        System.out.println(num + "번을 " + start + "번 기둥에서 " + end + "번 기둥으로 이동");

        if (num > 1) {
            move(num - 1, mid, end);
        }
    }
}