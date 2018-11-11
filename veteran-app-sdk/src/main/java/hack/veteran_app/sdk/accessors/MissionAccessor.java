package hack.veteran_app.sdk.accessors;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import hack.veteran_app.sdk.backend.ExceptionHelper;
import hack.veteran_app.sdk.backend.exceptions.InternalServerErrorException;
import hack.veteran_app.sdk.backend.exceptions.NotFoundException;
import hack.veteran_app.sdk.backend.exceptions.UnauthorizedException;
import hack.veteran_app.sdk.backend.factories.RetrofitService;
import hack.veteran_app.sdk.backend.services.MissionServices;


public class MissionAccessor {
	final Logger logger = Logger.getLogger(this.getClass());
	static MissionServices service = RetrofitService.createService(MissionServices.class);

	public static List<Mission> getMissionType(String uuId) throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		try {
			retrofit2.Response<List<Mission>> response = service.getMissionType(uuId).execute();
			if (!response.isSuccessful()) {
				ExceptionHelper.throwErrorException(response.code(), response.errorBody());
			}

			return response.body();
		} catch (IOException e) {
			throw new InternalServerErrorException(e);
		}
	}
	
	public static List<Mission> getByMission(Mission mission) throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		try {
			retrofit2.Response<List<Mission>> response = service.getByMission(mission).execute();
			if (!response.isSuccessful()) {
				ExceptionHelper.throwErrorException(response.code(), response.errorBody());
			}

			return response.body();
		} catch (IOException e) {
			throw new InternalServerErrorException(e);
		}
	}
	
	public static List<Mission> postUserMession(Mission mission) throws UnauthorizedException, NotFoundException, InternalServerErrorException {
		try {
			retrofit2.Response<List<Mission>> response = service.getByMission(mission).execute();
			if (!response.isSuccessful()) {
				ExceptionHelper.throwErrorException(response.code(), response.errorBody());
			}

			return response.body();
		} catch (IOException e) {
			throw new InternalServerErrorException(e);
		}
	}

}
