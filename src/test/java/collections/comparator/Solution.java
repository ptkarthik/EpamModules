package collections.comparator;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            players[i] = new Player(name, score);
        }

        Checker checker = new Checker();
        Arrays.sort(players, checker);

        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getScore());
        }

        sc.close();
    }
}

