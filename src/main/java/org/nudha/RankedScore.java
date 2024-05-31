package org.nudha;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class RankedScore {

    //for each element from player we are sorting result table
    // in which each elem will less than elem from player
    // and count how many operations were (how many were sorted)

    //not optimized variant

//    public static List<Integer> rank(List<Integer> ranked, List<Integer> player){
//        return player.stream().map(score ->
//                (int)(ranked.stream().distinct().filter(r -> r>score).count()+1)).toList();
//    }

    public static List<Integer> rank(List<Integer> ranked, List<Integer> player){
        // Use TreeSet to remove duplicates and keep elements in sorted order
        TreeSet<Integer> rankedSet = new TreeSet<>(Collections.reverseOrder());
        rankedSet.addAll(ranked);

        // Convert TreeSet to List for indexed access
        List<Integer> distinctRanked = new ArrayList<>(rankedSet);

        // Result list to store the ranks for each player's score
        List<Integer> result = new ArrayList<>();

        // For each score in player, determine the rank
        for (int score : player) {
            int rank = binarySearchRank(distinctRanked, score);
            result.add(rank);
        }

        return result;
    }

    private static int binarySearchRank(List<Integer> ranked, int score) {
        int left = 0;
        int right = ranked.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (ranked.get(mid) == score) {
                return mid + 1;
            } else if (ranked.get(mid) < score) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left + 1;
    }
}
