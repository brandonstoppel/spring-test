package org.bstoppel.controller;

import org.bstoppel.exception.ServiceException;
import org.bstoppel.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ServiceControllerV1 implements ServiceController {

	private SomeService someService;

	@Autowired
	public void setSomeService(final SomeService someService) {
		this.someService = someService;
	}

	@Override
	public String getServiceName() {
		// TODO Auto-generated method stub
		return someService.getServiceName();
	}

	@GetMapping("/adapter/data")
	public String getAdapterData() {
		return someService.getAdapterData();
	}

	@GetMapping("/badMethod")
	public String getBadMethod() throws ServiceException {
		someService.unimplementedMethod();
		return null;
	}

}
