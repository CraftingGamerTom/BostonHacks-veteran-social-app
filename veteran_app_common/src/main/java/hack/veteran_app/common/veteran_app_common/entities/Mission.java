package hack.veteran_app.common.veteran_app_common.entities;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class Mission {
	private String typeOfMission;
	private Time duration;
	private String discription;
	
	private static Map<Long, User> missionAc = new HashMap<Long, User>();
	private static AtomicLong missionCounter = new AtomicLong();
	
	
	public Mission(String typeOfMission, Time duration, String description) {
		this.setTypeOfMission(typeOfMission);
		this.setDuration(duration);
		this.setDiscription(discription);
	}
	
	/**
	 * Get the mission Accessor
	 * @return the mission accessor
	 */
	public static Map<Long, User> getMissionAccessor() {
		return missionAc;
	}
	
	/**
	 * Get the mission counter
	 * @return the mission counter
	 */
	public static AtomicLong getMissionCounter() {
		return missionCounter;
	}
	/**
	 * @return the typeOfMission
	 */
	public String getTypeOfMission() {
		return typeOfMission;
	}
	/**
	 * @param typeOfMission the typeOfMission to set
	 */
	public void setTypeOfMission(String typeOfMission) {
		this.typeOfMission = typeOfMission;
	}
	/**
	 * @return the duration
	 */
	public Time getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Time duration) {
		this.duration = duration;
	}
	/**
	 * @return the discription
	 */
	public String getDiscription() {
		return discription;
	}
	/**
	 * @param discription the discription to set
	 */
	public void setDiscription(String discription) {
		this.discription = discription;
	}

}
