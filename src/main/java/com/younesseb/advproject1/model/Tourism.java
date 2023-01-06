package com.younesseb.advproject1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tourism {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tourismid;
    private int tourismType;
    private String tourismname;
    private String location;
    private String link;
    private String description;

    public Tourism() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTourismid() {
        return tourismid;
    }

    public void setTourismid(int tourismid) {
        this.tourismid = tourismid;
    }

    public int getTourismType() {
        return tourismType;
    }

    public void setTourismType(int tourismType) {
        this.tourismType = tourismType;
    }

    public String getTourismname() {
        return tourismname;
    }

    public void setTourismname(String tourismname) {
        this.tourismname = tourismname;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
