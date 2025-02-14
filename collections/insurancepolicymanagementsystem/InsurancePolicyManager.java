package com.example.collections.insurancepolicymanagementsystem;

import java.util.*;

public class InsurancePolicyManager {
    private Set<InsurancePolicy> hashSet = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSet = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("All Policies (HashSet): " + hashSet);
        System.out.println("All Policies (LinkedHashSet): " + linkedHashSet);
        System.out.println("All Policies (TreeSet - Sorted by Expiry Date): " + treeSet);
    }

    public void displayExpiringSoon() {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_MONTH, 30);
        Date threshold = cal.getTime();

        System.out.println("\nPolicies expiring within 30 days:");
        for (InsurancePolicy policy : treeSet) {
            if (policy.getExpiryDate().before(threshold)) {
                System.out.println(policy);
            }
        }
    }
        public void displayByCoverageType (String coverageType){
            System.out.println("\nPolicies with coverage type: " + coverageType);
            for (InsurancePolicy policy : hashSet) {
                if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                    System.out.println(policy);
                }
            }
        }

        public void findDuplicatePolicies () {
            Set<String> policyNumbers = new HashSet<>();
            System.out.println("Duplicate Policies:\n");
            for (InsurancePolicy policy : hashSet) {
                if (!policyNumbers.add(policy.getPolicyNumber())) {
                    System.out.println(policy);
                }
            }
        }
    }
