import java.util.ArrayList;

public class InsertionSort {
    public <T extends Comparable<T>> void insertionSort(ArrayList<T> array, Boolean printStatus) {
        if (printStatus) System.out.println("-----------------------------\n\t\t삽입정렬 과정\n-----------------------------");

        for (int i = 1; i < array.size(); i++) {
            for (int j = 0; j < i; j++) { //0부터 i - 1번째 요소까지 검사

                if (printStatus)
                    new SortingTest().printArray(array, true);

                if ((array.get(j)).compareTo(array.get(i)) > 0) { //array[i]보다 더 큰 숫자 array[j]가 있을 경우
                    T temp = array.get(i);

                    if (printStatus)
                        System.out.print(" => 삽입될 value : " + temp + " / 삽입될 index : " + j);

                    for (int k = i; k >= j; k--)
                        array.set(k, (k == j) ? temp : array.get(k - 1)); //array[j]에 array[i]를 삽입하고 나머지를 한 칸씩 뒤로 이동
                }

                if (printStatus) System.out.println();
            }
        }
    }
}
