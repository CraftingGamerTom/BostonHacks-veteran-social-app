package hack.veteran_app.sdk.backend.services;

import java.util.List;

import hack.veteran_app.sdk.accessors.Mission;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MissionServices {
	@GET("mission/{uuId}")
	Call<List<Mission>> getMissionType(@Path("uuId") String mission);

	@GET("user/{userName}/missions")
	Call<List<Mission>> getByMission(@Path("mission") Mission mission);
	
	@POST("missions{type}")
	public Call<Mission> postUserMession(@Path("userName") String userName, @Body Mission mission);

}
