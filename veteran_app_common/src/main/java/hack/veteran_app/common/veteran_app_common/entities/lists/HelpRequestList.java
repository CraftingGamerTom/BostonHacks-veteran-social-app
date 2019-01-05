package hack.veteran_app.common.veteran_app_common.entities.lists;

import java.util.List;

import hack.veteran_app.common.veteran_app_common.entities.HelpRequest;

public class HelpRequestList {
	private List<HelpRequest> helpRequests;

	public HelpRequestList(List<HelpRequest> helpRequests) {
		this.helpRequests = helpRequests;
	}

	public List<HelpRequest> getHelpRequests() {
		return helpRequests;
	}

	public void setHelpRequests(List<HelpRequest> helpRequests) {
		this.helpRequests = helpRequests;
	}
}
