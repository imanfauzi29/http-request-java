package two;

import com.google.gson.Gson;
import two.clients.APIClient;
import two.models.ApiModel;
import two.models.TodosModel;


public class MainApp {
    public static void main(String[] args) {

        APIClient apiClient = new APIClient();
        ApiModel getAll = apiClient.getAllData();

        String response = new Gson().toJson(getAll);
        System.out.println(response);
    }

}
