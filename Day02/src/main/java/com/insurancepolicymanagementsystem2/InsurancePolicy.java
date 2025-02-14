package com.insurancepolicymanagementsystem2;

import java.time.LocalDate;

class InsurancePolicy {
    private String policyNumber;
    private String policyHolder;
    private LocalDate expiryDate;

    public InsurancePolicy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{ Number='" + policyNumber + "', Holder='" + policyHolder + "', Expiry=" + expiryDate + " }";
    }
}
