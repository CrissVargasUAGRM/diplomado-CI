package com.nur.repositories.commend;

import com.nur.model.CommendJpaModel;
import com.nur.model.CommendPersonJpaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ICommendPersonCrudRepository extends JpaRepository<CommendPersonJpaModel, UUID> {
}
