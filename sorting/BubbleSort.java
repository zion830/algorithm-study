package sort;

import java.util.Arrays;

public class BubbleSort {
    private int[] items;

    public BubbleSort(int[] items) {
        this.items = items;
    }

    public int[] getItems() {
        return items;
    }

    // 앞에서부터 비교하며 정렬
    public void sortFromFront() {
        for (int i = 0; i < items.length; i++) {
            int end = items.length - i - 1;

            for (int j = 0; j < end; j++) {
                if (items[j] > items[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    // 뒤에서부터 비교하며 정렬
    public void sortFromEnd() {
        for (int i = items.length - 1; i > 0; i--) {
            int end = items.length - 1 - i;

            for (int j = items.length - 1; j > end; j--) {
                if (items[j - 1] > items[j]) {
                    swap(j, j - 1);
                }
            }
        }
    }

    private void swap(int index1, int index2) {
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }
}
