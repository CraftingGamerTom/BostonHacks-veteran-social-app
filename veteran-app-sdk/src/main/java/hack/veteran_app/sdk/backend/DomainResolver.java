package hack.veteran_app.sdk.backend;

import org.apache.log4j.Logger;

public class DomainResolver {
	final Logger logger = Logger.getLogger(this.getClass());

	private static final String REST_DOMAIN_DEV = "http://localhost:8090/api/";
	private static final String REST_DOMAIN_PROD = "https://api.spudata.com/api/";

	/**
	 * Get the domain of the REST Server
	 * 
	 * @return
	 */
	public static String getRESTUrl() {
		String env = System.getenv("VETERAN_APP_SERVER");
		if (env != null) {
			if (env.equalsIgnoreCase("dev")) {
				return REST_DOMAIN_DEV;
			}
		}
		return REST_DOMAIN_PROD;

	}
}
