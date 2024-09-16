package collections.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        // Compare scores in descending order
        int scoreComparison = Integer.compare(b.getScore(), a.getScore());

        // If scores are the same, compare names in ascending order
        if (scoreComparison == 0) {
            return a.getName().compareTo(b.getName());
        }

        return scoreComparison;
    }
}
