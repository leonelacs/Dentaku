package com.leonelacs.dentaku;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class GlanceActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    @Override

    public void onClick(View view) {
        TextView tvExpression = (TextView)findViewById(R.id.InputDisplay);
        TextView tvResult = (TextView)findViewById(R.id.ResultDisplay);
        switch ((int)view.getTag()) {
            case 0:
                tvExpression.setText(tvExpression.getText()+"0");
                break;
            case 1:
                tvExpression.setText(tvExpression.getText()+"1");
                break;
            case 2:
                tvExpression.setText(tvExpression.getText()+"2");
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glance);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button bt0 = (Button)findViewById(R.id.B0);
        Button bt1 = (Button)findViewById(R.id.B1);
        Button bt2 = (Button)findViewById(R.id.B2);
        Button bt3 = (Button)findViewById(R.id.B3);
        Button bt4 = (Button)findViewById(R.id.B4);
        Button bt5 = (Button)findViewById(R.id.B5);
        Button bt6 = (Button)findViewById(R.id.B6);
        Button bt7 = (Button)findViewById(R.id.B7);
        Button bt8 = (Button)findViewById(R.id.B8);
        Button bt9 = (Button)findViewById(R.id.B9);

        Button btDot = (Button)findViewById(R.id.BDot);
        Button btEqual = (Button)findViewById(R.id.BEqual);
        Button btAdd = (Button)findViewById(R.id.BAdd);
        Button btSubtract = (Button)findViewById(R.id.BSubtract);
        Button btMultiply = (Button)findViewById(R.id.BMultiply);
        Button btDivide = (Button)findViewById(R.id.BDivide);
        Button btDelete = (Button)findViewById(R.id.BDelete);

        Button btSin = (Button)findViewById(R.id.BSin);
        Button btCos = (Button)findViewById(R.id.BCos);
        Button btTan = (Button)findViewById(R.id.BTan);
        Button btArcSin = (Button)findViewById(R.id.BAsin);
        Button btArcCos = (Button)findViewById(R.id.BAcos);
        Button btArcTan = (Button)findViewById(R.id.BAtan);
        Button btLog = (Button)findViewById(R.id.BLog);
        Button btLn = (Button)findViewById(R.id.BLn);
        Button btSqrt = (Button)findViewById(R.id.BSqrt);
        Button btPow = (Button)findViewById(R.id.BPow);
        Button btPI = (Button)findViewById(R.id.BPi);
        Button btE = (Button)findViewById(R.id.Be);
        Button btFact = (Button)findViewById(R.id.BFact);
        Button btLeftBracket = (Button)findViewById(R.id.BLeft);
        Button btRightBracket = (Button)findViewById(R.id.BRight);



        bt0.setTag(0);
        bt1.setTag(1);
        bt2.setTag(2);
        bt3.setTag(3);
        bt4.setTag(4);
        bt5.setTag(5);
        bt6.setTag(6);
        bt7.setTag(7);
        bt8.setTag(8);
        bt9.setTag(9);

        btDot.setTag(10);
        btEqual.setTag(11);
        btAdd.setTag(12);
        btSubtract.setTag(13);
        btMultiply.setTag(14);
        btDivide.setTag(15);
        btDelete.setTag(16);

        btSin.setTag(17);
        btCos.setTag(18);
        btTan.setTag(19);
        btArcSin.setTag(20);
        btArcCos.setTag(21);
        btArcTan.setTag(22);
        btLn.setTag(23);
        btLog.setTag(24);
        btSqrt.setTag(25);
        btPI.setTag(26);
        btE.setTag(27);
        btPow.setTag(28);
        btLeftBracket.setTag(29);
        btRightBracket.setTag(30);
        btFact.setTag(31);

        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);

        btDot.setOnClickListener(this);
        btEqual.setOnClickListener(this);
        btAdd.setOnClickListener(this);
        btSubtract.setOnClickListener(this);
        btMultiply.setOnClickListener(this);
        btDivide.setOnClickListener(this);
        btDelete.setOnClickListener(this);

        btSin.setOnClickListener(this);
        btCos.setOnClickListener(this);
        btTan.setOnClickListener(this);
        btArcSin.setOnClickListener(this);
        btArcCos.setOnClickListener(this);
        btArcTan.setOnClickListener(this);
        btLn.setOnClickListener(this);
        btLog.setOnClickListener(this);
        btSqrt.setOnClickListener(this);
        btPI.setOnClickListener(this);
        btE.setOnClickListener(this);
        btPow.setOnClickListener(this);
        btLeftBracket.setOnClickListener(this);
        btRightBracket.setOnClickListener(this);
        btFact.setOnClickListener(this);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
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
        getMenuInflater().inflate(R.menu.glance, menu);
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
