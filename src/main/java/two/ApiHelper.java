package two;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHelper {
    public static Retrofit getRetrofit() {

        return new Retrofit.Builder()
                .baseUrl("http://online-course-todo.herokuapp.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
