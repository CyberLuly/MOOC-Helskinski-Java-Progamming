
public class Printer {

    public static void main(String[] args) {
        int[] array = new int[1];
        array[0] = 2;
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        if (array.length == 0) { // STOP IF LENGTH = 0
            return;
        }
        int arrayValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (arrayValue == 0 && i != 0) {
                System.out.println();
                arrayValue = array[i];
            }
            if (arrayValue == 0 && i == 0) {
                continue;
            }


            while (arrayValue != 0) {
                System.out.print("*");
                arrayValue--;
            }
            if (i == array.length - 1) {
                System.out.println();
                break;
            }
        }

    }
}