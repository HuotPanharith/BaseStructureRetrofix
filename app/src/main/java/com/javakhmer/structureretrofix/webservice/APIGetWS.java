package com.javakhmer.structureretrofix.webservice;

import com.javakhmer.structureretrofix.model.MultipleResource;
import com.javakhmer.structureretrofix.model.UserList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by panharithhuot on 4/2/17.
 */

public interface APIGetWS {
    @GET("/api/unknown")
    Call<MultipleResource> getListResources();

    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);
}
