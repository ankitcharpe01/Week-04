package com.example.collections.insurancepolicymanagementsystemusingmap;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        Policy policy1 = new Policy("P001", "Alice", LocalDate.of(2025, 3, 15));
        Policy policy2 = new Policy("P002", "Bob", LocalDate.of(2025, 2, 20));
        Policy policy3 = new Policy("P003", "Chef", LocalDate.of(2025, 5, 1));
        Policy policy4 = new Policy("P004", "Chef", LocalDate.of(2024, 12, 30));
        Policy policy5 = new Policy("P005", "Eric", LocalDate.of(2025, 2, 15));

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
        manager.addPolicy(policy4);
        manager.addPolicy(policy5);

        System.out.println("All Policies:");
        manager.displayAllPolicies();

        System.out.println("\nPolicies expiring within the next 30 days:");
        LocalDate currentDate = LocalDate.of(2025, 2, 15);
        List<Policy> expiringPolicies = manager.listPoliciesExpiringIn30Days(currentDate);
        for (Policy p : expiringPolicies) {
            System.out.println(p);
        }
        System.out.println("\nPolicies for Chef:");
        List<Policy> chefPolicies = manager.listPoliciesByPolicyholder("Chef");
        for (Policy p : chefPolicies) {
            System.out.println(p);
        }
        System.out.println("\nPolicy with number \"P001\" : ");
        System.out.println(manager.getPolicyByNumber("P001"));
        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies(currentDate);
        manager.displayAllPolicies();

    }
}


