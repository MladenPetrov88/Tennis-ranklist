import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tournaments = Integer.parseInt(scanner.nextLine());
        double points = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;
        double wins = 0;
        for (int i = 1; i <= tournaments ; i++) {
           String stats = scanner.nextLine();
            if (stats.equals("W")) {
                totalPoints += 2000;
                wins++;
            }
            if (stats.equals("F")) {
                totalPoints += 1200;
            }
            if (stats.equals("SF")){
                totalPoints += 720;
            }
        }
        System.out.printf("Final points: %.0f%n", totalPoints + points);
        double avgPoints = Math.floor(totalPoints / tournaments);
        System.out.printf("Average points: %.0f%n", avgPoints);
        double winTour = (wins / tournaments) * 100;
        System.out.printf("%.2f%%", winTour);

    }
}
