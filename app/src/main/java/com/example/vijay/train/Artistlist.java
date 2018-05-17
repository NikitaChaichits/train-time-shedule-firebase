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

public class Artistlist extends ArrayAdapter<Train> {

    private Activity context;
    private List<Train>artistList;



    public Artistlist(Activity context, List<Train>artistList){
        super(context,R.layout.list,artistList);
       this.context=context;
        this.artistList=artistList;

    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem=inflater.inflate(R.layout.list,null,true);
        TextView textViewName=(TextView)listViewItem.findViewById(R.id.textView_name);
        TextView textViewNumber=(TextView)listViewItem.findViewById(R.id.textView_number);
        TextView textViewArrival=(TextView)listViewItem.findViewById(R.id.textView_arrival);
        TextView textViewFrom=(TextView)listViewItem.findViewById(R.id.textView_from);
        TextView textViewTo=(TextView)listViewItem.findViewById(R.id.textView_to);
        Train artist=artistList.get(position);
        textViewName.setText(artist.getArtistname());
        textViewNumber.setText(artist.getArtistnumber());
        textViewArrival.setText(artist.getArtistarrival());
        textViewFrom.setText(artist.getArtistfrom());
        textViewTo.setText(artist.getArtistto());

        return listViewItem;
    }

}
