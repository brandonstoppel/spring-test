package org.bstoppel.service;

import org.bstoppel.adapter.ServiceAdapter;
import org.bstoppel.exception.NotImplementedException;
import org.bstoppel.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

	@Value("${app.feature.setting}")
	private String setting;

	private ServiceAdapter serviceAdapter;

	@Autowired
	public void setServiceAdapter(final ServiceAdapter serviceAdapter) {
		this.serviceAdapter = serviceAdapter;
	}

	public String getServiceName() {
		return setting;
	}

	public String getAdapterData() {
		return serviceAdapter.getData();
	}

	public void unimplementedMethod() throws ServiceException {
		throw new NotImplementedException("This Method is not implemented");
	}
}
