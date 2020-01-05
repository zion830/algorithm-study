package search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 11};

        System.out.println(search(arr, 11));
    }

    private static int search(int[] arr, int key) {
        int mid;
        int begin = 0;
        int end = arr.length - 1;

        while (begin <= end) {
            mid = (begin + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return -1;
    }
}
