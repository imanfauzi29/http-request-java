package one.clients;

import one.ApiHelper;
import one.models.ReqresModel;
import one.services.ReqresService;

import java.io.IOException;

public class APIClient {
    final ReqresService reqresService;

    public APIClient() {
        reqresService = ApiHelper.getRetrofit().create(ReqresService.class);
    }

    public ReqresModel reqresModel() {
        try {
            return reqresService.getData(1).execute().body();
        }catch (IOException e) {
            System.out.println("error:" + e.getMessage());
        }

        return null;
    }


}
