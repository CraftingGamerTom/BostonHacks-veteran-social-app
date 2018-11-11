package hack.veteran_app.sdk.backend;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RetrofitErrorBody {
	@JsonProperty("timestamp")
	private String timestamp;
	@JsonProperty("status")
	private int statusCode;
	@JsonProperty("error")
	private String errorType;
	@JsonProperty("message")
	private String errorMessage;
	@JsonProperty("path")
	private String path;

	public RetrofitErrorBody() {
	}

	public RetrofitErrorBody(String timestamp, int statusCode, String errorType, String errorMessage, String path) {
		this.timestamp = timestamp;
		this.statusCode = statusCode;
		this.errorType = errorType;
		this.errorMessage = errorMessage;
		this.path = path;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
