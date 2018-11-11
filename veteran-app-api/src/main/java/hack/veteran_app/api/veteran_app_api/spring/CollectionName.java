package hack.veteran_app.api.veteran_app_api.spring;

public enum CollectionName {

	USERS("user_collection"), MISSIONS("mission_collection"), HELP_REQUESTS("help_requests");

	private String collectionName;

	CollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String getCollectionName() {
		return collectionName;
	}
}
