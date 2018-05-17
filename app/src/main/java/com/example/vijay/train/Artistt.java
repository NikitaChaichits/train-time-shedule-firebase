package com.example.vijay.train;

import java.lang.reflect.Constructor;

/**
 * Created by vijay on 06-04-2017.
 */

public class Artistt {
    String artistname;
    String artistgenre;
    String artistid;
    public Artistt(){

    }
    public Artistt(String artistid,String artistname){
        this.artistgenre=artistgenre;
        this.artistname=artistname;
        this.artistid=artistid;
    }

    public String getArtistname() {
        return artistname;
    }

    public String getArtistgenre() {
        return artistgenre;
    }

    public String getArtistid() {
        return artistid;
    }
}
