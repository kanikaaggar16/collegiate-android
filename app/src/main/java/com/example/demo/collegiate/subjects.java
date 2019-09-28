package com.example.demo.collegiate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class subjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
                final Intent intent = getIntent();
                CardView card2 = (CardView) findViewById(R.id.card22);
                card2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(subjects.this,notes.class);
                        startActivity(i);
                    }
                });
                CardView card1 = (CardView) findViewById(R.id.card21);
                card1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(subjects.this,notes.class);
                        //i.putExtra("course_name",intent.getStringExtra("course_name"));
                       // i.putExtra("semester_name",intent.getStringExtra("semester_name"));
                        //  i.putExtra("semester_name", "semester 1" /*YOUR SEM*/);
                        //i.putExtra("subject name",su)
                        // do same in all
                       // i.putExtra("subject_name", "subject 1");
                        startActivity(i);

                        //  startActivity(i);
                    }
                });
                CardView card3 = (CardView) findViewById(R.id.card23);
                card3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(subjects.this,notes.class);
                        startActivity(i);
                    }
                });
                CardView card4 = (CardView) findViewById(R.id.card24);
                card4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(subjects.this,notes.class);
                        startActivity(i);
                    }
                });
                CardView card5 = (CardView) findViewById(R.id.card25);
                card5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(subjects.this,notes.class);
                        startActivity(i);
                    }
                });
                CardView card6 = (CardView) findViewById(R.id.card26);
                card6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(subjects.this,notes.class);
                        startActivity(i);
                    }
                });
                CardView card7 = (CardView) findViewById(R.id.card27);
                card7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(subjects.this,notes.class);
                        startActivity(i);
                    }
                });
                CardView card8 = (CardView) findViewById(R.id.card28);
                card8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(subjects.this,notes.class);
                        startActivity(i);
                    }
                });
                CardView card9 = (CardView) findViewById(R.id.card29);
                card9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(subjects.this,notes.class);
                        startActivity(i);
                    }
                });
                CardView card10 = (CardView) findViewById(R.id.card30);
                card10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(subjects.this,notes.class);
                        startActivity(i);
                    }
                });
            }

        }




