
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        gamesPlayed(file, teamName);
        winsAndLosses(file, teamName);

    }

    //Method to extract how many games were played by a team
    public static void gamesPlayed(String file, String teamName) {
        int games = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                if (row.contains(teamName)) {
                    games++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + games);

    }

    //Method to extract number of wins and losses from a team
    public static void winsAndLosses(String file, String teamName) {
        int wins = 0;
        int losses = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] splitRow = row.split(",");
                //If searched team is playing home
                if (splitRow[0].contains(teamName)) {
                    if (Integer.valueOf(splitRow[2]) > Integer.valueOf(splitRow[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                //If searched team is playing away
                if (splitRow[1].equals(teamName)) {
                    if (Integer.valueOf(splitRow[3]) > Integer.valueOf(splitRow[2])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}

