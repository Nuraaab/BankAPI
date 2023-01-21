/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TestAPI;

import entity.Account;
import entity.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 *
 * @author SWL
 */
public interface UserAPI {
    @GET("user/findall")
    Call<List<User>> findAll();
    @GET("user/find/{id}")
    Call<User> find(@Path("id") int id);
    @POST("user/create")
    Call<Void> create(@Body User user);
    @PUT("user/update")
    Call<Void> update(@Body User user);
    @DELETE("user/delete/{id}")
    Call<Void> delete(@Path("id") int id);
    @GET("acco/findall")
    Call<List<Account>> findAllAccount();
    @GET("acco/find/{id}")
    Call<Account> findById(@Path("id") int id);
    @POST("acco/create")
    Call<Void> createAccount(@Body Account acc);
    @PUT("acco/update") 
    Call<Void> updateAccount(@Body Account  acc);
    @DELETE("acco/delete")
    Call<Void> deleteById(@Path("id") int id);
    @PUT("acco/{id}/treansfer/{accRId}")
    Call<Void> transferAccount(@Path("id")int id,@Path("accRId") int accRId,@Path("ammount") int ammount);
}
