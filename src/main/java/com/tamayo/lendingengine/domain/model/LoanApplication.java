package com.tamayo.lendingengine.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

//la clase es final
@Entity
public final class LoanApplication {
    @Id
    private long id;
    private final double amount;
    private final User borrower;
    private final Duration repaymentTerm;
    private final double interestRate;

    public LoanApplication(double amount, User borrower, Duration repaymentTerm, double interestRate) {
        this.amount = amount;
        this.borrower = borrower;
        this.repaymentTerm = repaymentTerm;
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return amount;
    }

    public User getBorrower() {
        return borrower;
    }

    public Duration getRepaymentTerm() {
        return repaymentTerm;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanApplication that = (LoanApplication) o;
        return Double.compare(that.amount, amount) == 0 &&
                Double.compare(that.interestRate, interestRate) == 0 &&
                Objects.equals(borrower, that.borrower) &&
                Objects.equals(repaymentTerm, that.repaymentTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, borrower, repaymentTerm, interestRate);
    }

    @Override
    public String toString() {
        return "LoanRequest{" +
                "amount=" + amount +
                ", borower=" + borrower +
                ", repaymentTerm=" + repaymentTerm +
                ", interestRate=" + interestRate +
                '}';
    }
}
