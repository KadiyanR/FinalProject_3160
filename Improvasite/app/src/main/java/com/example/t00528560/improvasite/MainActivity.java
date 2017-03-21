package com.example.t00528560.improvasite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button testButtton;
    Button improveButtton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3940256099942544~3347511713");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        testButtton = (Button) findViewById(R.id.button);
        testButtton.setOnClickListener(this);

        improveButtton = (Button) findViewById(R.id.button2);
        improveButtton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.button:
                Intent intent = new Intent(this, eyeTestHome.class);
                this.startActivity(intent);
                break;

            case R.id.button2:
                Intent intent1 = new Intent(this, eyeImproveHome.class);
                this.startActivity(intent1);
                break;
        }
    }
}
