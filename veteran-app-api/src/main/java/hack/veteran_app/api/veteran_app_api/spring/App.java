package hack.veteran_app.api.veteran_app_api.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "hack.veteran_app.api.veteran_app_api.controllers",
		"hack.veteran_app.api.veteran_app_api.spring" })
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}