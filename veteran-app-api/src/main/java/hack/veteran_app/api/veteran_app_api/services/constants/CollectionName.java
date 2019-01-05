package hack.veteran_app.api.veteran_app_api.services.constants;

public enum CollectionName {

	USERS("users"), MISSIONS("missions"), HELP_REQUESTS("helpRequests");

	private String collectionName;

	CollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public String getCollectionName() {
		return collectionName;
	}
}
