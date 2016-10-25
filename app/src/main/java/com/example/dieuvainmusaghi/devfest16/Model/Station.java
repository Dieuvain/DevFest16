package com.example.dieuvainmusaghi.devfest16.Model;

/**
 *
 * Created by DieuvainMusaghi on 10/22/16.
 */

import java.io.Serializable;

public class Station implements Serializable {


    public double getKeroseneprice() {
        return Keroseneprice;
    }

    /*
    public void setKeroseneprice(String keroseneprice) {
        this.Keroseneprice = keroseneprice;
    }
    */

    public String getStationName() {
        return StationName;
    }

    /*
    public void setStationName(String stationName) {
        this.StationName = fullName;
    }
    */

    public double getPhoneNumber() { return Dieselprice; }

   /*
   public void setDieselprice(String dieselprice) {
        this.Dieselprice = dieselprice;
    }
    */

    public double getLatitude() {
        return Latitude;
    }

    /*
    public void setLatitude(String latitude) {
        Latitude = latitude;
    }
    */
    public double getLongitude() {
        return Longitude;
    }

    /*
    public void setLatitude(String latitude) {
        Latitude = latitude;
    }
    */

    public String getOpenHour() {
        return OpenHour;
    }

    /*
    public void setOpenHour(String openhour) {
        OpenHour = userType;
    }
    */

    private String StationName;
    private double Keroseneprice;
    private double Dieselprice;
    private double Latitude;
    private double Longitude;
    private String OpenHour;


    public Station(){
        //Null constructor
    }

    public Station(String stationName,String openHour){

        this.StationName=stationName;
        this.OpenHour=openHour;
    }

    public Station(String stationName,double keroseneprice,double dieselprice,double latitude,double longitude ,String openhour){

        this.StationName=stationName;
        this.Keroseneprice=keroseneprice;
        this.Dieselprice=dieselprice;
        this.Latitude=latitude;
        this.Longitude=longitude;
        this.OpenHour=openhour;

    }
}