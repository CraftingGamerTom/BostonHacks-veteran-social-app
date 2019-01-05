package hack.veteran_app.common.veteran_app_common.entities;

import java.time.ZonedDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HelpRequest {

	private String username;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
	private ZonedDateTime date;

	/**
	 * Creates a Help request
	 * 
	 */
	public HelpRequest(String username, ZonedDateTime date) {
		this.username = username;
		this.date = date;
	}

	public HelpRequest() {
	}

	/**
	 * @return the date
	 */
	public ZonedDateTime getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(ZonedDateTime date) {
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
