package com.showcase.elora.persistance.repository;

import com.showcase.elora.persistance.model.Manga;
import com.showcase.elora.persistance.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findByEmail(String email);
    Optional<User> findByID(String ID);

    @Query("SELECT u FROM User u WHERE u.roleId=:roleId")
    List<User> getAllUser(String roleId);
}
