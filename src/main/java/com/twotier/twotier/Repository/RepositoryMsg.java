package com.twotier.twotier.Repository;

import com.twotier.twotier.model.Msg;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMsg extends JpaRepository<Msg, Long> {



}
