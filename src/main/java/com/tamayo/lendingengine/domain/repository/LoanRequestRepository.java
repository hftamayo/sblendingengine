package com.tamayo.lendingengine.domain.repository;

import com.tamayo.lendingengine.domain.model.LoanRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRequestRepository extends JpaRepository<LoanRequest, Long> {
}
