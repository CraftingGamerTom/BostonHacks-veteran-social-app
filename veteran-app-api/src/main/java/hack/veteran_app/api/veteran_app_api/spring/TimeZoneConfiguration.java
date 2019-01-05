package hack.veteran_app.api.veteran_app_api.spring;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class TimeZoneConfiguration {
	@PostConstruct
	public void postConstruct() {
		// set the JVM timezone to UTC
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
}