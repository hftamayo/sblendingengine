package com.tamayo.lendingengine.application.model;

import com.tamayo.lendingengine.domain.model.Duration;
import com.tamayo.lendingengine.domain.model.User;

import java.util.Objects;

public class LoanRequest {
    private final double amount;
    private final long borrowerId;
    private final int daysToRepay;
    private final double interestRate;

    public LoanRequest(double amount, long borrowerId, int daysToRepay, double interestRate) {
        this.amount = amount;
        this.borrowerId = borrowerId;
        this.daysToRepay = daysToRepay;
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return amount;
    }

    public long getBorrowerId() {
        return borrowerId;
    }

    public int getDaysToRepay() {
        return daysToRepay;
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
                borrowerId == that.borrowerId &&
                daysToRepay == that.daysToRepay &&
                Double.compare(that.interestRate, interestRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, borrowerId, daysToRepay, interestRate);
    }

    @Override
    public String toString() {
        return "LoanRequest{" +
                "amount=" + amount +
                ", borrowerId=" + borrowerId +
                ", daysToRepay=" + daysToRepay +
                ", interestRate=" + interestRate +
                '}';
    }
}
