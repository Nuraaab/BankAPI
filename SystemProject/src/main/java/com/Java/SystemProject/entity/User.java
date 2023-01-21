package com.Java.SystemProject.entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="user")
public class User implements Serializable{
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private String id;
	    private String  email;
	    private String password;
		private String first_name;
	    private String last_name;
	    private String gender;
	    private String  status;
	    public void setStatus(String status) {
			this.status = status;
		}
		private String insert_time;
	    private String last_update;
	    public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}

	        public String getEmail(){
	        return email;
	    }
	     public void setEmail(String  email){
	        this.email=email;
	    }
	        public String getPassword(){
	        return password;
	    }     
	    public void setPassword(String password){
	        this.password=password;
	    }
	         public String getFirstName(){
	        return first_name;
	    }   
	    public void setFirstName(String  first_name){
	        this.first_name=first_name;
	    } 
	        public String getLastName(){
	        return last_name;
	    }    
	    public void setLastName(String  last_name){
	        this.last_name=last_name;
	    } 
	        public String getGender(){
	        return gender;
	    }    
	     public void setGender(String  gender){
	        this.gender=gender;
	    } 
	        public String getStatus() {
			return status;
		}
			public String getInsertTime(){
	        return insert_time;
	    }     
	     public void setInsertTime(String  insert_time){
	        this.insert_time=insert_time;
	    }  
	        public String getLastUpdate(){
	        return last_update;
	    }     
	      public void setLastUpdate(String  last_update){
	        this.last_update=last_update;
	    }  
}
