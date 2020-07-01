package com.tamayo.lendingengine.domain.repository;

import com.tamayo.lendingengine.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
