package com.zemoga.web.repository.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class PortfolioUserDTO implements Serializable {

    private long id;

    @NotNull
    @NotEmpty
    private String experience;

    @NotNull
    @NotEmpty
    private String imagePath;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String twitterUser;

    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private String address;

    @NotNull
    @NotEmpty
    private String phone;

    @NotNull
    @NotEmpty
    private String zipCode;

    @NotNull
    @NotEmpty
    private String adress;

    @NotNull
    @NotEmpty
    private String twiter_user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTwitterUser() {
        return twitterUser;
    }

    public void setTwitterUser(String twitterUser) {
        this.twitterUser = twitterUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTwiter_user() {
        return twiter_user;
    }

    public void setTwiter_user(String twiter_user) {
        this.twiter_user = twiter_user;
    }

    @Override
    public String toString() {
        return "PortfolioUserDTO{" +
                "id=" + id +
                ", experience='" + experience + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", name='" + name + '\'' +
                ", twitterUser='" + twitterUser + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", adress='" + adress + '\'' +
                ", twiter_user='" + twiter_user + '\'' +
                '}';
    }
}
