
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grade = new Grade();

        System.out.println("Enter point totals, -1 stops:");
        grade.setPoints(Integer.valueOf(scanner.nextLine()), scanner);
        grade.getAllAverage(grade);
        grade.getPassingAverage(grade);
        grade.getPassPercentage(grade);
        grade.getGradeDistribution(grade);


    }
}
