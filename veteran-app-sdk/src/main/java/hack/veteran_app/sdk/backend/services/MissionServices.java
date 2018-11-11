package hack.veteran_app.sdk.backend.services;

import java.util.List;

import hack.veteran_app.common.veteran_app_common.entities.Mission;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface MissionServices {
	@GET("mission/{uuId}")
	Call<List<Mission>> getMissionUuid(@Path("uuId") String uuId);

	@PUT("missions")
	public Call<List<Mission>> putUserMession();

}
