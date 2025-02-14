package com.insurancepolicymanagementsystem2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Adding some policies
        manager.addPolicy(new InsurancePolicy("P001", "Alice", LocalDate.of(2025, 3, 15)));
        manager.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.of(2024, 2, 20)));
        manager.addPolicy(new InsurancePolicy("P003", "Alice", LocalDate.of(2024, 3, 5)));

        // Display all policies
        System.out.println("All Policies:");
        manager.displayAllPolicies();

        // Retrieve a policy by number
        System.out.println("\nPolicy P002 Details:");
        System.out.println(manager.getPolicyByNumber("P002"));

        // Policies expiring in the next 30 days
        System.out.println("\nPolicies expiring within 30 days:");
        System.out.println(manager.getPoliciesExpiringSoon(30));

        // Policies by policyholder
        System.out.println("\nPolicies of Alice:");
        System.out.println(manager.getPoliciesByHolder("Alice"));

        // Removing expired policies
        manager.removeExpiredPolicies();
        System.out.println("\nAfter removing expired policies:");
        manager.displayAllPolicies();
    }
}
