package two.services;

import two.models.ApiModel;
import two.models.TodosModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("todos")
    Call<ApiModel> getAll();
}
