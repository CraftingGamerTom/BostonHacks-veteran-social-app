package hack.veteran_app.common.veteran_app_common.entities;

import java.util.Date;

public class HelpRequest {
	
	private Date date;
	private String typeOfHelp;
	
	/**
	 * Creates a Help request
	 * 
	 */
	public HelpRequest(Date date, String typeOfHelp) {
		this.date = date;
		this.typeOfHelp = typeOfHelp;
	}
	
	

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the typeOfHelp
	 */
	public String getTypeOfHelp() {
		return typeOfHelp;
	}

	/**
	 * @param typeOfHelp the typeOfHelp to set
	 */
	public void setTypeOfHelp(String typeOfHelp) {
		this.typeOfHelp = typeOfHelp;
	}
	

}
