package com.javakhmer.structureretrofix.webservice;

import com.javakhmer.structureretrofix.model.User;
import com.javakhmer.structureretrofix.model.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by panharithhuot on 4/1/17.
 */

public interface APIPostWS {


    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}
