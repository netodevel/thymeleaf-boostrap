package thymeleaf.boostrap.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import thymeleaf.bootstrap.dialect.BootstrapDialect;

@Configuration
public class AditionalDialects {

	@Bean
	public BootstrapDialect bootstrapDialect() {
		return new BootstrapDialect();
	}
	
}
