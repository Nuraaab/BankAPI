/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;



import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 *
 * @author SWL
 */
public class User implements Serializable{
   @SerializedName("id")
    private int id;
   @SerializedName("email")
    private String  email;
   @SerializedName("password")
    private String password;
   @SerializedName("firstName")
    private String first_name;
   @SerializedName("lastName")
    private String last_name;
   @SerializedName("gender")
    private String gender;
   @SerializedName("status")
    private int status;
   @SerializedName("insertTime")
    private String insert_time;
   @SerializedName("lastUpdate")
    private String last_update;
   
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(String insert_time) {
		this.insert_time = insert_time;
	}
	public String getLast_update() {
		return last_update;
	}
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
}
