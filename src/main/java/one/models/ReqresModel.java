package one.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReqresModel {

    @SerializedName("page")
    int page;
    @SerializedName("per_page")
    int perPage;
    @SerializedName("total")
    int totalUsers;
    @SerializedName("total_pages")
    int totalPages;
    @SerializedName("data")
    List<UserModel> Data;


}
