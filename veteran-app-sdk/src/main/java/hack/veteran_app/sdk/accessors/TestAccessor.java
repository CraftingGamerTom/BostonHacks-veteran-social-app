package hack.veteran_app.sdk.accessors;

import java.io.IOException;

import org.apache.log4j.Logger;

import hack.veteran_app.sdk.backend.ExceptionHelper;
import hack.veteran_app.sdk.backend.exceptions.InternalServerErrorException;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import hack.veteran_app.sdk.backend.exceptions.UnauthorizedException;
import hack.veteran_app.sdk.backend.factories.RetrofitService;
import hack.veteran_app.sdk.backend.services.TestService;
import retrofit2.Response;

public class TestAccessor {

	final Logger logger = Logger.getLogger(this.getClass());
	static TestService service = RetrofitService.createService(TestService.class);

	public static String testCall() throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		try {
			Response<String> response = service.getTest().execute();
			if (!response.isSuccessful()) {
				ExceptionHelper.throwErrorException(response.code(), response.errorBody());
			}

			return response.body();
		} catch (IOException e) {
			throw new InternalServerErrorException(e);
		}
	}
}