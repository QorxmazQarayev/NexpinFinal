package com.changesite.nexpin_final_project.repository;

import com.changesite.nexpin_final_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
     Optional<User> findByUserName(String username);
List<User> findByActive(boolean active);
}
