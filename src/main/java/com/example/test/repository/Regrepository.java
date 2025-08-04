package com.example.test.repository;

import com.example.test.entity.Regentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Regrepository extends JpaRepository<Regentity,Long> {
}
