package com.scriptkiddie.task.master.service;

import org.springframework.stereotype.Service;

import com.scriptkiddie.task.master.model.Task;
import com.scriptkiddie.task.master.repo.TaskRepository;

@Service
public class TaskService {

	protected final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}
}
