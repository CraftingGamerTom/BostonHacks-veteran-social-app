package hack.veteran_app.api.veteran_app_api.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	/**
	 * https://github.com/springfox/springfox/issues/1615
	 * 
	 * @return
	 */
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("hack.veteran_app.api.veteran_app_api.controllers"))
				.paths(PathSelectors.any()).build().pathMapping("/api").apiInfo(metaData());

	}

	private ApiInfo metaData() {
		return new ApiInfoBuilder().title("Veterans App API")
				.description("Proof of concept for BostonHacks Hackathon BU 2018").version("1.0.0")
				.license("Copyright Hackers 2018")
				.licenseUrl("https://github.com/CraftingGamerTom/BostonHacks-veteran-social-app/blob/master/LICENSE")
				.contact(new Contact("Hackers", "website", "email")).build();
	}
}
