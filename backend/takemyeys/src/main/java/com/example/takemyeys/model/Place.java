/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.takemyeys.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="photo")
public class Place implements Serializable{
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int photo_id;
    @Column(name="user_id")
    private int user_id;
    @Column(name="caption")
    private String caption;
    @Column(name="latitude")
    private float latitude;
    @Column(name="longitude")
    private float longitude;
    @Column(name="image_path")
    private String image_path;
    @Column(name="image_size")
    private int image_size;
    @Column(name="date_created")
    private Date date_created;
    @Column(name="date_updated")
    private Date dateupdated;

    public Place() {
    }

    public Place(int user_id, String caption, float latitude, float longitude, String image_path, int image_size, Date date_created, Date dateupdated) {
        this.user_id = user_id;
        this.caption = caption;
        this.latitude = latitude;
        this.longitude = longitude;
        this.image_path = image_path;
        this.image_size = image_size;
        this.date_created = date_created;
        this.dateupdated = dateupdated;
    }

    public int getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(int photo_id) {
        this.photo_id = photo_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public int getImage_size() {
        return image_size;
    }

    public void setImage_size(int image_size) {
        this.image_size = image_size;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDateupdated() {
        return dateupdated;
    }

    public void setDateupdated(Date dateupdated) {
        this.dateupdated = dateupdated;
    }

    @Override
    public String toString() {
        return "Place{" + "photo_id=" + photo_id + ", user_id=" + user_id + ", caption=" + caption + ", latitude=" + latitude + ", longitude=" + longitude + ", image_path=" + image_path + ", image_size=" + image_size + ", date_created=" + date_created + ", dateupdated=" + dateupdated + '}';
    }
    
    
       
}
