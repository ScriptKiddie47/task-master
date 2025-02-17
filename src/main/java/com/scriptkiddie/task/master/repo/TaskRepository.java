package com.scriptkiddie.task.master.repo;

import org.springframework.stereotype.Repository;

import com.scriptkiddie.task.master.model.Task;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface TaskRepository extends MongoRepository<Task,String>{
	
}
