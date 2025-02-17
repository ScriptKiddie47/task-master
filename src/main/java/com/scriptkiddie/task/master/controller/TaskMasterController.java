package com.scriptkiddie.task.master.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class TaskMasterController {

	private static final Logger LOG = LoggerFactory.getLogger(TaskMasterController.class);

	@GetMapping("/")
	protected String home(HttpSession httpSession,Principal principal,Model model) throws UnknownHostException {
		LOG.info("User logged in from : Hostname: " + InetAddress.getLocalHost().getHostName() + " Address: "
				+ InetAddress.getLocalHost().getHostAddress() + " Session ID: " + httpSession.getId());
		model.addAttribute("username", principal.getName());
		return "home";
	}
	
	@GetMapping("/create-task")
	protected String createTask() {
		return "create-task";
	}

}
