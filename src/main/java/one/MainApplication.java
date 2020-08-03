package one;

import com.google.gson.Gson;
import one.clients.APIClient;
import one.models.ReqresModel;
import one.services.ReqresService;

public class MainApplication {

    public static void main(String[] args) {
        APIClient client = new APIClient();
        ReqresModel reqresService = client.reqresModel();

        String response = new Gson().toJson(reqresService);
        System.out.println(response);

        System.exit(0);
    }
}
