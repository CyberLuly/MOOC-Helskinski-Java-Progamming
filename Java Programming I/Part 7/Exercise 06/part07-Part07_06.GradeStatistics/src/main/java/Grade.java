import java.util.ArrayList;
import java.util.Scanner;

public class Grade {

    ArrayList<Integer> points;
    ArrayList<Integer> passingPoints;
    double passingAverage;

    public Grade() {
        points = new ArrayList<>();
        passingPoints = new ArrayList<>();
        passingAverage = 0;
    }


    public void setPoints(int points, Scanner scanner) {
        while (points != -1) {
            if (points > -1 && points < 101) {
                this.points.add(points);
            }
            if (points >= 50 && points < 101) {
                this.passingPoints.add(points);
            }
            points = Integer.valueOf(scanner.nextLine());
        }
    }

    public void getAllAverage(Grade grade) {
        int sum = 0;

        for (int points : this.points) {
            sum += points;
        }
        System.out.print("Point average (all): " + ((double) sum / points.size()));
        System.out.println();
    }

    public void getPassingAverage(Grade grade) {
        int sum = 0;

        for (int points : this.passingPoints) {
            sum += points;
        }

        this.passingAverage = ((double) sum / passingPoints.size());
        if (passingPoints.isEmpty()) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.passingAverage);
        }
    }

    public void getPassPercentage(Grade grade) {
        double passPercentage = (double) (100 * grade.passingPoints.size()) / grade.points.size();
        System.out.println("Pass percentage: " + passPercentage);
    }

    public void getGradeDistribution(Grade grade) {
        int starsGrade5 = 0;
        int starsGrade4 = 0;
        int starsGrade3 = 0;
        int starsGrade2 = 0;
        int starsGrade1 = 0;
        int starsFailedGrade = 0;

        // Grade 5
        for (int point : this.points) {
            if (point >= 90) {
                starsGrade5++;
            }

            if (point < 90 && point >= 80) {
                starsGrade4++;
            } else if (point < 80 && point >= 70) {
                starsGrade3++;
            } else if (point < 70 && point >= 60) {
                starsGrade2++;
            } else if (point < 60 && point >= 50) {
                starsGrade1++;
            } else if (point < 50) {
                starsFailedGrade++;
            }
        }

        System.out.print("5: ");
        printStars(starsGrade5);

        System.out.print("4: ");
        printStars(starsGrade4);

        System.out.print("3: ");
        printStars(starsGrade3);

        System.out.print("2: ");
        printStars(starsGrade2);

        System.out.print("1: ");
        printStars(starsGrade1);

        System.out.print("0: ");
        printStars(starsFailedGrade);

    }


    public void printStars(int number) {
        while (number != 0) {
            System.out.print("*");
            number--;
        }
        System.out.println();
    }


}
