package com.example.demo.collegiate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class retrieve extends AppCompatActivity {
    private TextView text1;
    private Button btn_1 , btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);
        final Intent intent = getIntent();
        btn_1 = (Button)findViewById(R.id.button1);
        btn_2 = (Button)findViewById(R.id.button2);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(retrieve.this,upload.class);
                startActivity(i);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(retrieve.this,retrieve_file.class);
                //Intent i = new Intent(subjects.this,notes.class);
               // i.putExtra("course_name",intent.getStringExtra("btech it"));
                //i.putExtra("z",intent.getStringExtra("smester_name"));
                //i.putExtra("subject_name",intent.getStringExtra("subject 1"));
              //  i.putExtra("subject_name",intent.getStringExtra(""))//wait retrie
               // i.putExtra("material", "previous year" /*YOUR SEM*/);

                startActivity(i);
            }
        });
        /*
        pdfView=(PDFView)findViewById(R.id.pdfView);
        text1=(TextView)findViewById(R.id.text1);
        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                text1.setText(value);
                Toast.makeText(retrieve.this,"Updated",Toast.LENGTH_SHORT).show();
                String url = text1.getText().toString();
                new RetrivePdfStream().execute(url);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(retrieve.this,"Failed to upload",Toast.LENGTH_SHORT).show();
            }
        });}
        class RetrivePdfStream extends AsyncTask<String,Void, InputStream>
        {

            @Override
            protected InputStream doInBackground(String... strings) {
                InputStream inputStream = null ;
                try
                {
                    URL url = new URL(strings[0]);
                    HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
                    if(urlConnection.getResponseCode()==200)
                    {
                        inputStream = new BufferedInputStream(urlConnection.getInputStream());
                    }
                }
                catch (IOException e)
                {
                    return null;
                }
                return inputStream;
            }
            @Override
            protected void onPostExecute(InputStream inputStream)
            {
                pdfView.fromStream(inputStream).load();
            }
        */
    }

    }

