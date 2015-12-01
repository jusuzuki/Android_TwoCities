package com.epicodus.twocities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.cityOneTime) TextView cityOneTime;
    @Bind(R.id.cityTwoTime) TextView cityTwoTime;
    private long mCurrentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mCurrentTime = new Date().getTime();

        cityOneTime.setText(getTimeCityOne());
        cityTwoTime.setText(getTimeCityTwo());

    }

    public String getTimeCityOne(){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mma");
        formatter.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        return formatter.format(mCurrentTime);
    }

    public String getTimeCityTwo(){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mma");
        formatter.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
        return formatter.format(mCurrentTime);
    }


}
