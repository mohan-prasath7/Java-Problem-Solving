package com.hlms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "legal_checklist_item")
public class LegalChecklistItem {

    @Id
    @Column(name = "checklist_item_id", length = 50, nullable = false)
    private String checklistItemId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_id", nullable = false)
    private LoanApplication application;

    // App's LEGAL_CHECKLIST keys in use: titleDeed, encumbrance, saleDeed,
    // noc, valuation, taxReceipt.
    @Column(name = "checklist_key", length = 100, nullable = false)
    private String checklistKey;

    @Column(name = "status", length = 30, nullable = false)
    private String status = "Pending";

    public LegalChecklistItem() {
    }

    public String getChecklistItemId() {
        return checklistItemId;
    }

    public void setChecklistItemId(String checklistItemId) {
        this.checklistItemId = checklistItemId;
    }

    public LoanApplication getApplication() {
        return application;
    }

    public void setApplication(LoanApplication application) {
        this.application = application;
    }

    public String getChecklistKey() {
        return checklistKey;
    }

    public void setChecklistKey(String checklistKey) {
        this.checklistKey = checklistKey;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
