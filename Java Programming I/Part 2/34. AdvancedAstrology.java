
public class AdvancedAstrology {
    public static void main(String[] args) {
        christmasTree(4);

    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");

        }
    }

    public static void printTriangle(int size) {
        int spaces = size - 1;
        for (int i = 1; i <= size; i++) {
            printSpaces(spaces);
            spaces--;
            printStars(i);

        }
    }

    public static void christmasTree(int height) {
        int spaces = height - 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(spaces);
            spaces--;
            if (i == 1) {
                printStars(i);
            } else {
                printStars(i + (i - 1));
            }

        }
        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}