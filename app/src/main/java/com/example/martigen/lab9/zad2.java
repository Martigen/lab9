package com.example.martigen.lab9;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class zad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("zad2");
        RelativeLayout layout =   new RelativeLayout(this);
        ImageView jellyImageView = new ImageView(this);
        jellyImageView.setImageResource(R.drawable.jellybeans);

        ContextCompat.getDrawable(getApplicationContext(), R.drawable.jellybeans);

        int height = (int)getResources().getDimension(R.dimen.jelly_height);
        int width = (int)getResources().getDimension(R.dimen.jelly_width);

        RelativeLayout.LayoutParams params = new
                RelativeLayout.LayoutParams(width,height);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);
        jellyImageView.setLayoutParams(params);

        layout.addView(jellyImageView,params);
        setContentView(layout);


    }
}
