package com.example.demo.collegiate;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {

    private Activity context;
    private String[] text;

    public MyAdapter(Activity context, String[] text) {
        super(context, R.layout.single_item, text);
        this.text = text;
        this.context=context;


    }


    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.single_item, null, true);

        TextView text1= (TextView) rowView.findViewById(R.id.text11);


        text1.setText(text[position]);
        return rowView;
    }
}