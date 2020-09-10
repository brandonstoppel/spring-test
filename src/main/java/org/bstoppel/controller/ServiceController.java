package org.bstoppel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/default")
public interface ServiceController {

	@GetMapping("/service/name")
	String getServiceName();
}
