package com.example.manne.assignment_1;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

//samsung galaxy core plus - 480*800pix
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView quote = (TextView)findViewById(R.id.quotestxt);
        Resources res = getResources();

        final String[] quotes = res.getStringArray(R.array.quotes);

        Button button = (Button)findViewById(R.id.button);
        Log.i("OnCreate","Launched");
        quote.getTextColors();

        button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                    Log.i("MyApp", "Button pressed");
                    final int rando = (int) (Math.random()*3);
                    quote.setText(quotes[rando]);
                    }
                }

        );
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
