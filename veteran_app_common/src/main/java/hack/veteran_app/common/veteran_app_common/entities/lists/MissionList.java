package hack.veteran_app.common.veteran_app_common.entities.lists;

import java.util.List;

import hack.veteran_app.common.veteran_app_common.entities.Mission;

public class MissionList {
	private List<Mission> missions;

	public MissionList(List<Mission> missions) {
		super();
		this.missions = missions;
	}

	public List<Mission> getMissions() {
		return missions;
	}

	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}
}
