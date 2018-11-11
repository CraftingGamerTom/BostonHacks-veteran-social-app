package hack.veteran_app.sdk.backend.services;

import hack.veteran_app.common.veteran_app_common.entities.HelpRequest;
import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.POST;


public interface HelpRequestServices {
	@GET("help-request")
	public Call<HelpRequest> getHelpRequest();
	
	@POST("help-request")
	public Call<HelpRequest> postHelpRequest();

}
