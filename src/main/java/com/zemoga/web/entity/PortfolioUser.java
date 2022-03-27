package com.zemoga.web.entity;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Component
@ToString
@NoArgsConstructor
@Table(name = "portfolio", schema = "portfolioDB")
public class PortfolioUser {

    @Id
    private long id;

    @Column(name = "experience")
    private String experience;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "name")
    private String name;

    @Column(name = "twitter_user")
    private String twitterUser;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "adress")
    private String adress;

    @Column(name = "twiter_user")
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
}
