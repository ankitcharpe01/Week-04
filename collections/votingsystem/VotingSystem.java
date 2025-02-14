package com.example.collections.votingsystem;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> votesMap = new HashMap<>();
    private Map<String, Integer> voteOrderMap = new LinkedHashMap<>();

    public void castVote(String candidate) {
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, votesMap.get(candidate));
    }

    public void displayVotesInOrder() {
        System.out.println("\nVotes in order of casting:");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    //Display sorted results
    public void displaySortedResults() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(votesMap);
        System.out.println("\nSorted Voting Results:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}