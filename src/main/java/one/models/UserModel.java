package one.models;

import com.google.gson.annotations.SerializedName;
import two.models.ApiModel;

public class UserModel {
    @SerializedName("id")
    int id;
    @SerializedName("email")
    String email;
    @SerializedName("first_name")
    String fName;
    @SerializedName("last_name")
    String lName;
    @SerializedName("avatar")
    String avatar;
}
