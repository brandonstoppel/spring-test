package org.bstoppel.configuration;

import org.bstoppel.onceler.RoundRobinData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@RefreshScope
public class RoundRobinConfigurer {

	@Bean
	@Scope("prototype")
	public RoundRobinData roundRobinData(@Value("${app.adapter.other.data}") final String data) {
		RoundRobinData.getInstance().setData(data);
		return RoundRobinData.getInstance();
	}
}
