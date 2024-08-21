package com.classicalmotors.carwashing.entity;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="user_table", uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class Users
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
//@NotEmpty(message = "Enter your name.")
private String firstName;
//@NotNull
//@Size(max=64)
private String lastName;
//@Email(message="Enter valid Email Id.")
private String email;
//@Digits(message="Number should contain 10 digits.", fraction = 0, integer = 10)
private String phoneNo;

private String city;
private String state;
private  int pincode;
private String userName;
    private String password;

    //@Column(name="role", length=20)
   
    private  String role;
   
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Vehical> vehicals = new ArrayList<>();
   
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Appointment> Appointment = new ArrayList<>();
   
    @OneToMany(mappedBy = "users")
    private List<Notification> notifications=new ArrayList<>();

public Users() {
super();
}



public Users(int id, String firstName, String lastName, String email, String phoneNo, String city, String state,
int pincode, String userName, String password, String role) {
super();
this.id = id;
this.firstName = firstName;
this.lastName = lastName;
this.email = email;
this.phoneNo = phoneNo;
this.city = city;
this.state = state;
this.pincode = pincode;
this.userName = userName;
this.password = password;
this.role = role;
}



public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getPhoneNo() {
return phoneNo;
}

public void setPhoneNo(String phoneNo) {
this.phoneNo = phoneNo;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

public int getPincode() {
return pincode;
}

public void setPincode(int pincode) {
this.pincode = pincode;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getUsername() {
return userName;
}

public void setUsername(String userName) {
this.userName = userName;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

public String getRole() {
return role;
}

public void setRole(String role) {
this.role = role;
}

@Override
public String toString() {
return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo
+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", email=" + email + ", userName="
+ userName + ", password=" + password + ", role=" + role + "]";
}
   


}