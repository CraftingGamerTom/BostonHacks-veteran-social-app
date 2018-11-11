package hack.veteran_app.sdk.backend.factories;

import hack.veteran_app.sdk.backend.DomainResolver;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitService {
	private static Retrofit.Builder builder = new Retrofit.Builder().baseUrl(DomainResolver.getRESTUrl())
			.addConverterFactory(JacksonConverterFactory.create());

	private static Retrofit retrofit = builder.build();

	private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

	public static <S> S createService(Class<S> serviceClass) {
		return retrofit.create(serviceClass);
	}
}
