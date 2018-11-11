/**
 * Copyright (c) 2017 Thomas Rokicki
 */

package hack.veteran_app.api.veteran_app_api.spring;

import org.apache.log4j.Logger;

public class MongoSecuritySingleton {

	final static Logger logger = Logger.getLogger(MongoSecuritySingleton.class);
	private static MongoSecuritySingleton instance = null; // Singleton

	private static final String USERNAME_PLACEHOLDER = "vetUser";
	private static final String PASSWORD_PLACEHOLDER = "SuperSecret";

	private String username;
	private String password;

	private static MongoSecuritySingleton getInstance() {
		if (instance == null) {
			instance = new MongoSecuritySingleton();
			instance.read();
		}
		return instance;
	}

	/**
	 * reread the configuration file always done in singleton instance
	 */
	private void read() {
		// Sets the configurations - Add properties here
		username = USERNAME_PLACEHOLDER;
		password = PASSWORD_PLACEHOLDER;
	}

	/**
	 * Re-reads the configuration file (use sparingly - only for testing)
	 */
	public void reset() {
		logger.info("RELOADING CONFIGURATION");
		getInstance().read();
		logger.info("FINISHED RELOADING");
	}

	// Getters

	public static String getUsername() {
		return getInstance().getPrivateUsername();
	}

	public static String getPassword() {
		return getInstance().getPrivatePassword();
	}

	// Private Getters

	public String getPrivateUsername() {
		return this.username;
	}

	public String getPrivatePassword() {
		return this.password;
	}
}