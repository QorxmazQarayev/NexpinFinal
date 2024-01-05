package com.changesite.nexpin_final_project.repository;

import com.changesite.nexpin_final_project.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    List<Accounts> findByUserIdAndIsActive(Long userId, boolean isActive);
}
