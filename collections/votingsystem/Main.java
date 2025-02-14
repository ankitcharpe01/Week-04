package com.example.collections.votingsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter candidate names to vote. Type 'exit' to stop:");

        while (true) {
            System.out.print("Vote for: ");
            String candidate = scanner.nextLine().trim();

            if (candidate.equalsIgnoreCase("exit")) {
                break;
            }

            votingSystem.castVote(candidate);
        }

        scanner.close();

        // Display results
        votingSystem.displayVotesInOrder();
        votingSystem.displaySortedResults();
    }
}
