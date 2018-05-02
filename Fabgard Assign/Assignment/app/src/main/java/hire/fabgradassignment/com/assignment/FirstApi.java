package hire.fabgradassignment.com.assignment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * A simple {@link Fragment} subclass.
 */
public interface FirstApi {

    public static String URl = "http://www.fabgrad.com/";

    @FormUrlEncoded
    @POST("dummy_api_1/")
    Call<Titles> getData(@Field("us_id") String id);

}