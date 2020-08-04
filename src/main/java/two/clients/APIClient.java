package two.clients;

import two.ApiHelper;
import two.models.ApiModel;
import two.services.ApiServices;

import java.io.IOException;

public class APIClient {
    private final ApiServices apiServices;

    public APIClient() {
        apiServices = ApiHelper.getRetrofit().create(ApiServices.class);
    }

    public ApiModel getAllData() {
        try {
            return apiServices.getAll().execute().body();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
