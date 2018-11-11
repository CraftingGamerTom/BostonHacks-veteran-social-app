package hack.veteran_app.sdk.accessors;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import hack.veteran_app.sdk.backend.ExceptionHelper;
import hack.veteran_app.sdk.backend.exceptions.InternalServerErrorException;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import hack.veteran_app.sdk.backend.exceptions.UnauthorizedException;
import hack.veteran_app.sdk.backend.factories.RetrofitService;
import hack.veteran_app.sdk.backend.services.UserServices;
import retrofit2.Response;

public class UserAccessor {
	final Logger logger = Logger.getLogger(this.getClass());
	static UserServices service = RetrofitService.createService(UserServices.class);

	public static User getByUserName(String userName) throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		try {
			Response<User> response = service.getByUserName(userName).execute();
			if (!response.isSuccessful()) {
				ExceptionHelper.throwErrorException(response.code(), response.errorBody());
			}

			return response.body();
		} catch (IOException e) {
			throw new InternalServerErrorException(e);
		}
	}
	
	public static User getUserByEmail(String userName) throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		try {
			Response<User> response = service.getUserByEmail(userName).execute();
			if (!response.isSuccessful()) {
				ExceptionHelper.throwErrorException(response.code(), response.errorBody());
			}

			return response.body();
		} catch (IOException e) {
			throw new InternalServerErrorException(e);
		}
	}
	
	public static User putUserName(User user, String userName) throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		try {
			Response<User> response = service.putUserName(user, userName).execute();
			if (!response.isSuccessful()) {
				ExceptionHelper.throwErrorException(response.code(), response.errorBody());
			}

			return response.body();
		} catch (IOException e) {
			throw new InternalServerErrorException(e);
		}
	}
	
	public static User getUserMission(String userName) throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		try {
			Response<List<Mission>> response = service.getUserMission(userName).execute();
			if (!response.isSuccessful()) {
				ExceptionHelper.throwErrorException(response.code(), response.errorBody());
			}

			return (User) response.body();
		} catch (IOException e) {
			throw new InternalServerErrorException(e);
		}
	}
	
	public static User postUser(User user) throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		try {
			Response<User> response = service.postUser(user).execute();
			if (!response.isSuccessful()) {
				ExceptionHelper.throwErrorException(response.code(), response.errorBody());
			}

			return response.body();
		} catch (IOException e) {
			throw new InternalServerErrorException(e);
		}
	}
		
		public static Mission postUserMession(String userName, Mission mission) throws UnauthorizedException, NotFoundException, InternalServerErrorException {
			try {
				Response<Mission> response = service.postUserMession(userName, mission).execute();
				if (!response.isSuccessful()) {
					ExceptionHelper.throwErrorException(response.code(), response.errorBody());
				}

				return response.body();
			} catch (IOException e) {
				throw new InternalServerErrorException(e);
			}	
		
	}
	
}
