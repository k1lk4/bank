package ru.aretinsky.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.aretinsky.bank.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String username);

    Boolean existsByEmail(String email);

    Boolean existsByPhone(Long phone);

    Boolean existsByLogin(String username);
}
