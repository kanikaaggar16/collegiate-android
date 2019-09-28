package com.example.demo.collegiate;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class course extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        CardView card2 = (CardView) findViewById(R.id.card2);
        CardView card1 = (CardView)findViewById(R.id.card1);
        CardView card3 = (CardView)findViewById(R.id.card3);
        CardView card4 = (CardView)findViewById(R.id.card4);
        CardView card5 = (CardView)findViewById(R.id.card5);
        CardView card6 = (CardView)findViewById(R.id.card6);
        CardView card7 = (CardView)findViewById(R.id.card7);
        CardView card8 = (CardView)findViewById(R.id.card8);
        CardView card9 = (CardView)findViewById(R.id.card9);
        CardView card10 = (CardView)findViewById(R.id.card10);
        CardView card11 = (CardView)findViewById(R.id.card11);
        CardView card12 = (CardView)findViewById(R.id.card12);

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
              //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card5.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card6.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card7.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card8.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card9.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card10.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card11.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
        card12.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(course.this,semester.class);
                //  i.putExtra("course_name","btech it"/*YOUR COURSE*/);
                startActivity(i);
            }
        });
    }




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.course, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
      /*  int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }*/

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
        
        

    }
}
