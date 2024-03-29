import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int integers : array) {
            if (integers < smallest) {
                smallest = integers;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        int index = 0;

        while (index < array.length) {

            if (array[index] < array[smallestIndex]) {
                smallestIndex = index;
            }
            index++;
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        int index = startIndex;

        while (index < table.length) {

            if (table[index] < table[smallestIndex]) {
                smallestIndex = index;
            }
            index++;
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int indexHolder = array[index1];
        array[index1] = array[index2];
        array[index2] = indexHolder;
    }

    public static void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.println(Arrays.toString(array));
            swap(array, indexOfSmallestFrom(array, i), i);
            i++;
        }
    }


}
