package one.services;

import one.models.ReqresModel;
import one.models.getIdModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ReqresService {
    @GET("users")
    Call<ReqresModel> getData(@Query("page") int page);

    @GET("users/{id}")
    Call <getIdModel> getId(@Path("id") int id);
}
