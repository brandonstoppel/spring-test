package org.bstoppel.configuration;

import java.util.ServiceLoader;

import org.bstoppel.adapter.ServiceAdapter;
import org.bstoppel.onceler.RoundRobinData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdapterConfigurer {

	@Bean("serviceAdapter")
	public ServiceAdapter getServiceAdapter(@Value("${app.adapter.name}") final String adapterName,
			final RoundRobinData roundRobinData) {
		final var loader = ServiceLoader.load(ServiceAdapter.class);
		for (final ServiceAdapter p : loader) {
			if (p.getAdapterName().equals(adapterName)) {
				p.setRoundRobinData(roundRobinData);
				return p;
			}
		}

		throw new RuntimeException("No Adapter Specified");
	}
}
