package two.models;

import com.google.gson.annotations.SerializedName;

public class TodosModel {

    @SerializedName("id")
    int id;
    @SerializedName("task")
    String task;
    @SerializedName("status")
    boolean status;
    @SerializedName("createdAt")
    String createdAt;
    @SerializedName("updateAt")
    String updateAt;

}
