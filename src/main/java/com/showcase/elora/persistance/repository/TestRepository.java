package com.showcase.elora.persistance.repository;

import com.showcase.elora.persistance.model.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Manga,Long> {
   }
