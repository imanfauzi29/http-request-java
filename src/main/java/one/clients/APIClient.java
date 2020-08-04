package one.clients;

import one.ApiHelper;
import one.models.ReqresModel;
import one.models.getIdModel;
import one.services.ReqresService;

import java.io.IOException;

public class APIClient {
    final ReqresService reqresService;

    public APIClient() {
        reqresService = ApiHelper.getRetrofit().create(ReqresService.class);
    }

    public ReqresModel getAll() {
        try {
            return reqresService.getData(1).execute().body();
        }catch (IOException e) {
            System.out.println("error:" + e.getMessage());
        }

        return null;
    }

    public getIdModel getById() {
        try {
            return reqresService.getId(2).execute().body();

        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }

        return null;
    }


}
