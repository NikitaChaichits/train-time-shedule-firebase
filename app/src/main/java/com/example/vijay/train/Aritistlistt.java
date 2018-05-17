package com.example.vijay.train;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vijay on 09-04-2017.
 */

public class Aritistlistt extends ArrayAdapter<Artistt> {

    private Activity context;
    private List<Artistt>artistListt;



    public Aritistlistt(Activity context, List<Artistt>artistListt){
        super(context,R.layout.listt,artistListt);
        this.context=context;
        this.artistListt=artistListt;

    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem=inflater.inflate(R.layout.listt,null,true);
        TextView textViewName=(TextView)listViewItem.findViewById(R.id.textw);
       // TextView textViewGenre=(TextView)listViewItem.findViewById(R.id.textView2);
        Artistt artist=artistListt.get(position);
        textViewName.setText(artist.getArtistname());
       // textViewGenre.setText(artist.getArtistgenre());

        return listViewItem;
    }

}
