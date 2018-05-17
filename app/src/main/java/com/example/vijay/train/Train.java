package com.example.vijay.train;

import java.lang.reflect.Constructor;

/**
 * Created by vijay on 06-04-2017.
 */

public class Train {
    String artistname;
    String artistnumber;
    String artistarrival;
    String artistfrom;
    String artistto;
    String artistid;
    
    public Train(){

    }

    public Train(String artistid, String artistnumber,String artistarrival,String artistfrom,String artistto, String artistname){
        this.artistnumber=artistnumber;
        this.artistarrival=artistarrival;
        this.artistfrom=artistfrom;
        this.artistto=artistto;
        this.artistname=artistname;
        this.artistid=artistid;
    }

    public String getArtistname() {
        return artistname;
    }

    public String getArtistnumber() {
        return artistnumber;
    }
    public String getArtistarrival() {
        return artistarrival;
    }
    public String getArtistfrom() {
        return artistfrom;
    }
    public String getArtistto() {
        return artistto;
    }

    public String getArtistid() {
        return artistid;
    }
}
