package hack.veteran_app.sdk.backend.services;

import java.util.List;

import hack.veteran_app.common.veteran_app_common.entities.Mission;
import hack.veteran_app.common.veteran_app_common.entities.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserServices {
	
	@GET("user/getByEmail/{email}")
	Call<User> getUserByEmail(@Query("email") String email);

	@POST("user")
	public Call<User> postUser(@Body User user);
	
	@GET("users/{userName}")
	Call<User> getByUser(@Path("userName") String userName);
	
	@PUT("users/{userName}")
	Call<User> putUser(@Body User user, String userName);	
	
	@GET("user/{userName}/missions")
	Call<List<Mission>> getUserMission(@Path("userName") String userName);

	@POST("user/{userName}/missions")
	public Call<Mission> postUserMession(@Path("userName") String userName, @Body Mission mission);
	
	
//	@PUT("user")
//	public Call<String> updateUser(@Body Object testObject);
}
