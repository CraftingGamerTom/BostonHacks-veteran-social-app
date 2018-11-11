package hack.veteran_app.sdk.backend.services;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TestService {
	@GET("test")
	public Call<String> getTest();

//	@POST("test")
//	public Call<String> postTest(@Body Object testObject);

//	@PUT("test")
//	public Call<String> updateTest(@Body Object testObject);

}
