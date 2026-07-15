package com.hlms.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "insurance_policy")
public class InsurancePolicy {

    @Id
    @Column(name = "policy_id", length = 50, nullable = false)
    private String policyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_id", nullable = false)
    private LoanApplication application;

    // App creates exactly two policies per disbursed loan: 'property', 'life'.
    @Column(name = "policy_type", length = 50)
    private String policyType;

    @Column(name = "status", length = 30, nullable = false)
    private String status = "Active";

    @Column(name = "valid_till")
    private LocalDate validTill;

    public InsurancePolicy() {
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public LoanApplication getApplication() {
        return application;
    }

    public void setApplication(LoanApplication application) {
        this.application = application;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getValidTill() {
        return validTill;
    }

    public void setValidTill(LocalDate validTill) {
        this.validTill = validTill;
    }
}
