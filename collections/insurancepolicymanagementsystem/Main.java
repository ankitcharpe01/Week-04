package com.example.collections.insurancepolicymanagementsystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new InsurancePolicy("P123", "Alice", new Date(2025, 3, 10), "Health", 1200));
        manager.addPolicy(new InsurancePolicy("P124", "Bob", new Date(2025, 2, 20), "Auto", 800));

        manager.displayAllPolicies();
        manager.displayExpiringSoon();
        manager.displayByCoverageType("Health");
        manager.findDuplicatePolicies();
    }
}
