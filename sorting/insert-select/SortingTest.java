import java.util.ArrayList;
import java.util.Scanner;

public class SortingTest<T> {
    public static void main(String[] args) {
        SortingTest test = new SortingTest();

        ArrayList<Integer> intArray = new ArrayList<>(); //일반 Integer type 배열
        intArray.add(80);
        intArray.add(34);
        intArray.add(3);
        intArray.add(6);
        intArray.add(13);

        ArrayList<Double> doubleArray = new ArrayList<>(); //일반 Double type 배열
        doubleArray.add(79.4);
        doubleArray.add(3.2);
        doubleArray.add(9.8);
        doubleArray.add(79.2);
        doubleArray.add(5.4);

        ArrayList<Person> personArray = new ArrayList<>(); //key가 int인 Person type 배열
        personArray.add(new Person<>(80, "Person1"));
        personArray.add(new Person<>(24, "Person2"));
        personArray.add(new Person<>(1, "Person3"));
        personArray.add(new Person<>(5, "Person4"));
        personArray.add(new Person<>(13, "Person5"));

        ArrayList<Person> personArray2 = new ArrayList<>(); //key가 char인 Person type 배열
        personArray2.add(new Person<>('c', "Person1"));
        personArray2.add(new Person<>('h', "Person2"));
        personArray2.add(new Person<>('d', "Person3"));
        personArray2.add(new Person<>('a', "Person4"));
        personArray2.add(new Person<>('b', "Person5"));

        ArrayList<Person> personArray3 = new ArrayList<>(); //key가 string인 Person type 배열
        personArray3.add(new Person<>("hbc", "Person1"));
        personArray3.add(new Person<>("vda", "Person2"));
        personArray3.add(new Person<>("amd", "Person3"));
        personArray3.add(new Person<>("aad", "Person4"));
        personArray3.add(new Person<>("fff", "Person5"));
        System.out.println("\n\n과정출력 여부를 선택해주세요.\n'yes' or 'no'\n");
        String selectPrint = new Scanner(System.in).next();

        Boolean printStatus = selectPrint.equals("yes");

        test.choiceSort(intArray, printStatus);
        test.choiceSort(doubleArray, printStatus);
        test.choiceSort(personArray, printStatus);
        test.choiceSort(personArray2, printStatus);
        test.choiceSort(personArray3, printStatus);
    }

    public <T extends Comparable<T>> void choiceSort(ArrayList<T> array, Boolean printStatus) {
        SortingTest test = new SortingTest();

        System.out.println("\n-----------------------------\n\t\t입력받은 배열\n-----------------------------");
        test.printArray(array, true);


        System.out.println("\n\n정렬 방식을 선택해주세요.\n1.선택정렬 2.삽입정렬\n");
        int select = new Scanner(System.in).nextInt();

        switch (select) {
            case 1:
                new SelectionSort().selectionSort(array, printStatus);
                break;
            case 2:
                new InsertionSort().insertionSort(array, printStatus);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

        System.out.println("-----------------------------\n\t\t정렬 결과\n-----------------------------");
        test.printArray(array, true);
        System.out.println();
    }

    public void printArray(ArrayList<T> array, Boolean p) {
        if (p) for (T val : array) System.out.print(" " + val);
    }

    public void printArray(ArrayList<T> array) {
        printArray(array, false);
    }
}