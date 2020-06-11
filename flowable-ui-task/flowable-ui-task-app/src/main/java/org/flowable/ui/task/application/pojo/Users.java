package org.flowable.ui.task.application.pojo;


import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UserId;
    @Column(name="name")
    private String Name;
    @Column(name="number")
    private String Number;
    @Column(name="id")
    private String Id;
    @Column(name="age")
    private Integer Age;
    @Column(name="address")
    private String Address;
    @Column(name="mobilephone")
    private String Mobilephone;
    @Column(name="email")
    private String Email;

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMobilephone() {
        return Mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        Mobilephone = mobilephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
