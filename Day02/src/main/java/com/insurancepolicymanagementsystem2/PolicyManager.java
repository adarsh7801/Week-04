package com.insurancepolicymanagementsystem2;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>();
    private LinkedHashMap<String, InsurancePolicy> orderedPolicies = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<InsurancePolicy>> sortedByExpiry = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicies.put(policy.getPolicyNumber(), policy);

        sortedByExpiry.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<InsurancePolicy> getPoliciesExpiringSoon(int days) {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(days);
        List<InsurancePolicy> result = new ArrayList<>();

        for (Map.Entry<LocalDate, List<InsurancePolicy>> entry : sortedByExpiry.headMap(limit, true).entrySet()) {
            result.addAll(entry.getValue());
        }

        return result;
    }

    public List<InsurancePolicy> getPoliciesByHolder(String policyHolder) {
        List<InsurancePolicy> result = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.getPolicyHolder().equalsIgnoreCase(policyHolder)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, List<InsurancePolicy>>> iterator = sortedByExpiry.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<LocalDate, List<InsurancePolicy>> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                for (InsurancePolicy policy : entry.getValue()) {
                    policyMap.remove(policy.getPolicyNumber());
                    orderedPolicies.remove(policy.getPolicyNumber());
                }
                iterator.remove();
            }
        }
    }

    public void displayAllPolicies() {
        for (InsurancePolicy policy : orderedPolicies.values()) {
            System.out.println(policy);
        }
    }
}
