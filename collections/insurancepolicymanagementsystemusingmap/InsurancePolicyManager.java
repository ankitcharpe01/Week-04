package com.example.collections.insurancepolicymanagementsystemusingmap;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {
    private HashMap<String, Policy> policyHashMap;
    private LinkedHashMap<String, Policy> policyLinkedHashMap;
    private TreeMap<LocalDate, Policy> policyTreeMap;

    public InsurancePolicyManager() {
        policyHashMap = new HashMap<>();
        policyLinkedHashMap = new LinkedHashMap<>();
        policyTreeMap = new TreeMap<>();
    }

    public void addPolicy(Policy policy) {
        policyHashMap.put(policy.getPolicyNumber(), policy);
        policyLinkedHashMap.put(policy.getPolicyNumber(), policy);
        policyTreeMap.put(policy.getExpiryDate(), policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policyHashMap.get(policyNumber);
    }

    public List<Policy> listPoliciesExpiringIn30Days(LocalDate currentDate) {
        List<Policy> expiringPolicies = new ArrayList<>();
        LocalDate thresholdDate = currentDate.plusDays(30);

        for (Map.Entry<LocalDate, Policy> entry : policyTreeMap.entrySet()) {
            if (!entry.getKey().isAfter(thresholdDate)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    public List<Policy> listPoliciesByPolicyholder(String policyholderName) {
        List<Policy> holderPolicies = new ArrayList<>();
        for (Policy policy : policyLinkedHashMap.values()) {
            if (policy.getPolicyholderName().equals(policyholderName)) {
                holderPolicies.add(policy);
            }
        }
        return holderPolicies;
    }

    public void removeExpiredPolicies(LocalDate currentDate) {
        Iterator<Map.Entry<LocalDate, Policy>> iterator = policyTreeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<LocalDate, Policy> entry = iterator.next();
            if (entry.getKey().isBefore(currentDate)) {
                iterator.remove();
                policyLinkedHashMap.remove(entry.getValue().getPolicyNumber());
                policyHashMap.remove(entry.getValue().getPolicyNumber());
            }
        }
    }

    public void displayAllPolicies() {
        for (Policy policy : policyLinkedHashMap.values()) {
            System.out.println(policy);
        }
    }
}

