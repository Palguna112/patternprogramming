package pattrenprogramming112;

import java.util.Scanner;

public class RescueQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of jails in Malhar's Place: ");
        int totalJails = scanner.nextInt();

        int[] jailNumbers = new int[totalJails];
        for (int i = 0; i < totalJails; i++) {
            System.out.print("Enter the jail number " + (i + 1) + ": ");
            jailNumbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the clue given by Malhar: ");
        int clue = scanner.nextInt();

        int low = 0;
        int high = totalJails - 1;
        int nextJail = -1;

        // Binary search to find the next jail
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (jailNumbers[mid] == clue) {
                nextJail = mid;
                break;
            } else if (jailNumbers[mid] < clue) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (nextJail == -1) {
            System.out.println("The King has been fooled by Malhar");
        } else {
            System.out.println("Hurray! The King rescued the Queen");
        }

        scanner.close();
    }
}