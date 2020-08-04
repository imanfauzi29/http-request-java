package one;

import com.google.gson.Gson;
import one.clients.APIClient;
import one.models.ReqresModel;
import one.models.getIdModel;

public class MainApplication {

    public static void main(String[] args) {
        getAll();
        System.out.println("=== Get User By Id ===");
        getById();
        System.exit(0);
    }

    public static void getAll() {
        APIClient client = new APIClient();
        ReqresModel getAll = client.getAll();

        String response = new Gson().toJson(getAll);
        System.out.println(response);
    }

    public static void getById() {
        APIClient client = new APIClient();
        getIdModel getById = client.getById();

        String response = new Gson().toJson(getById);
        System.out.println(response);

    }

}
