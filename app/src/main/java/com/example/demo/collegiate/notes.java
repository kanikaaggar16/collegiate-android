package com.example.demo.collegiate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class notes extends AppCompatActivity {
    //ListView listview;
   // String string[] = {"SEMESTER 1", "SEMESTER 2", "SEMESTER 3", "SEMESTER 4", "SEMESTER 5",
         //   "SEMESTER 6", "SEMESTER 7", "SEMESTER 8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        CardView card1 = (CardView) findViewById(R.id.card31);
        CardView card2 = (CardView) findViewById(R.id.card32);
       final Intent intent = getIntent();
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(notes.this,retrieve.class);
              //  i.putExtra("course_name",intent.getStringExtra("course_name"));
                //i.putExtra("semester_name",intent.getStringExtra("semester_name"));
                //  i.putExtra("semester_name", "semester 1" /*YOUR SEM*/);
                //i.putExtra("subject name",su)
                // do same in all
                //i.putExtra("subject_name",intent.getStringExtra("subject_name"));
                startActivity(i);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(notes.this,retrieve.class);
                startActivity(i);
            }
        });
    }
}