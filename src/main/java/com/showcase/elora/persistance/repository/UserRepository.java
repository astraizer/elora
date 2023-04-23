package com.showcase.elora.persistance.repository;

import com.showcase.elora.persistance.model.Manga;
import com.showcase.elora.persistance.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findByEmail(String email);
}
