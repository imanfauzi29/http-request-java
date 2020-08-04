package two.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiModel {

    @SerializedName("status")
    boolean status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    List<TodosModel> data;

}
