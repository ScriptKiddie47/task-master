package com.scriptkiddie.task.master.model;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Task")
public class Task {
	@Id
	private String id;
	private UUID taskId;
	private String taskName;
	private String taskDetails;
	private String createdBy;
	private List<String> users;
}
