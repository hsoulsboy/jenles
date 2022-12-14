package com.jenles.repositories;

import com.jenles.models.TaskModel;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, UUID> {
	
}