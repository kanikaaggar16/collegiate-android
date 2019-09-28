package com.example.demo.collegiate;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

    public class semester extends AppCompatActivity {
        ListView listview;
       // String[] string;

        String string[] = {"SEMESTER 1", "SEMESTER 2", "SEMESTER 3", "SEMESTER 4", "SEMESTER 5",
                "SEMESTER 6", "SEMESTER 7", "SEMESTER 8"};


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_semester);

            final Intent intent = getIntent();

           final MyAdapter adapter=new MyAdapter(semester.this,string);
            listview=(ListView)findViewById(R.id.listview1);
            listview.setAdapter(adapter);

            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent i = new Intent(semester.this,subjects.class);
                   // i.putExtra("course_name",intent.getStringExtra("course_name"));
                    //i.putExtra("semester_name", string[position]);
                    //i.putExtra("position", position);
                    startActivity(i);


                    /*if (position == 0) {

                       // Toast.makeText(semester.this, "Select Semester 1", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(semester.this,subjects.class);
                        i.putExtra("course_name",intent.getStringExtra("course_name"));
                        i.putExtra("semester_name", string[position] *//*YOUR SEM*//*);
                        // do same in all
                        startActivity(i);
                    }
                    else if(position == 1)
                    {
                       // Toast.makeText(semester.this, "Select Semester 2", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(semester.this,subjects.class);
                        startActivity(i);
                    }
                    else if(position == 2)
                    {
                       // Toast.makeText(semester.this, "Select Semester 3", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(semester.this,subjects.class);
                        startActivity(i);
                    }
                    else if(position == 3)
                    {
                        //Toast.makeText(semester.this, "Select Semester 4", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(semester.this,subjects.class);
                        startActivity(i);
                    }
                    else if(position == 4)
                    {
                       // Toast.makeText(semester.this, "Select Semester 5", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(semester.this,notes.class);
                        startActivity(i);
                    }
                    else if(position == 5)
                    {
                        //Toast.makeText(semester.this, "Select Semester 6", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(semester.this,subjects.class);
                        startActivity(i);
                    }
                    else if(position == 6)
                    {
                        //Toast.makeText(semester.this, "Select Semester 7", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(semester.this,subjects.class);
                        startActivity(i);
                    }
                    else if(position == 7)
                    {
                       // Toast.makeText(semester.this, "Select Semester 8", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(semester.this,subjects.class);
                        startActivity(i);
                    }*/
                }
            });

            }
        }

