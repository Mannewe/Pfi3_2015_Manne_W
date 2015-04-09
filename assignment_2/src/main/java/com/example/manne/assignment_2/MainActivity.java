package com.example.manne.assignment_2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity {
ImageButton button1;

    public void getNewFragment(View v){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Plannerer planner = new Plannerer();
        ft.replace(R.id.mp, planner);
        ft.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Start start = new Start();
        ft.replace(R.id.mj, start);
        ft.commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("OnPause", "Paused");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("OnStart", "Started");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("OnStop","Stopped");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("OnResume","Resumed");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("OnDestroyed","Destroyed");
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
}
