package org.bstoppel.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "my-actuator")
public class CustomActuator {

	private String value;

	@ReadOperation
	public String getValue() {
		return value;
	}

	@WriteOperation
	public void setValue(final String value) {
		this.value = value;
	}

}
