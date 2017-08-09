package devsbox.discount_on.Activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import devsbox.discount_on.Adaptor.CustomAdapterLeft;
import devsbox.discount_on.R;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    ListView left_list;

    String[] header = {
            "Agoda Up To 12% OFF In Malaysia Hotel For GP STAR",
            "Get 30% Discount On Our Entire KAMEEZ Line",
            "GP STAR 10% off @ Rangs",
            "GP STAR Will Enjoy Upto 60% Discount On Room Rent @ Sikder Resort & Villas In Kuakata"
    } ;

    String[] address = {
            "Published date: August 1, 2017   Modified date: August 5, 2017\n" +
                    "www.agoda.com/, Online support",
            "Published date: July 30, 2017   Modified date: July 30, 2017  \n" +
                    " Bangladesh",
            "Grameenphone  All Outlet of Rangs Electronics Limited (Dhaka) August 1, 2017",
            "Sikder Resort & Villas, Hossainpara, Mohipur, Kuakakta, Bangladesh"
    } ;

    String[] percent = {"10.00%",
            "20.00%",
            "15.00%",
            "50.00%"
    } ;

    Integer[] imageId = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


///////////////////List view left///////
        CustomAdapterLeft adapter = new CustomAdapterLeft(HomeActivity.this, header,address, imageId , percent);

        left_list=(ListView)findViewById(R.id.left_listListView);
        left_list.setAdapter(adapter);

        left_list=(ListView)findViewById(R.id.Right_listListView);
        left_list.setAdapter(adapter);



        ////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);

        return true;
    }

   /* @Override
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
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
