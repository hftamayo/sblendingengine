package com.tamayo.lendingengine.domain.model;

import java.util.Objects;

//la clase es final
public final class LoanRequest {

    private final double amount;
    private final User borower;
    private final Duration repaymentTerm;
    private final double interestRate;

    public LoanRequest(double amount, User borower, Duration repaymentTerm, double interestRate) {
        this.amount = amount;
        this.borower = borower;
        this.repaymentTerm = repaymentTerm;
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return amount;
    }

    public User getBorower() {
        return borower;
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
        LoanRequest that = (LoanRequest) o;
        return Double.compare(that.amount, amount) == 0 &&
                Double.compare(that.interestRate, interestRate) == 0 &&
                Objects.equals(borower, that.borower) &&
                Objects.equals(repaymentTerm, that.repaymentTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, borower, repaymentTerm, interestRate);
    }

    @Override
    public String toString() {
        return "LoanRequest{" +
                "amount=" + amount +
                ", borower=" + borower +
                ", repaymentTerm=" + repaymentTerm +
                ", interestRate=" + interestRate +
                '}';
    }
}
