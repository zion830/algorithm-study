import java.util.ArrayList;

public class SelectionSort {

    public <T extends Comparable<T>> void selectionSort(ArrayList<T> array, Boolean printStatus) {
        if (printStatus) System.out.println("-----------------------------\n\t\t선택정렬 과정\n-----------------------------");
        T min;
        int minIndex;

        for (int i = 0; i < array.size() - 1; i++) {
            min = array.get(i);
            minIndex = i;

            for (int j = i; j < array.size(); j++) { //i부터 n 중에서
                if (array.get(j).compareTo(min) < 0) { //최소값을 찾아 값과 인덱스 저장
                    min = array.get(j);
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                if (printStatus)
                    System.out.println("=> swap될 value : " + min + " <=> " + array.get(i)
                            + " / swap 될 index : " + minIndex + " <=> " + i);

                array.set(minIndex, array.get(i));
                array.set(i, min); //i번 요소와 최소값을 교환
            }

            if (printStatus) new SortingTest().printArray(array, true);
            System.out.println();
        }
    }

}
