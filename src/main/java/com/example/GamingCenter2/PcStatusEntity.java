package com.example.GamingCenter2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PcStatus")
public class PcStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String gamingCenterName;
    private long pcNumber;
    private String timestamp;


    public String getGamingCenterName() {
        return gamingCenterName;
    }

    public void setGamingCenterName(String gamingCenterName) {
        this.gamingCenterName = gamingCenterName;
    }

    public long getPcNumber() {
        return pcNumber;
    }

    public void setPcNumber(long pcNumber) {
        this.pcNumber = pcNumber;
    }
    public Long getId() {
        return id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
