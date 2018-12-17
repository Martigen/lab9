package com.example.martigen.lab9;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class zad5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("zad5");
        RelativeLayout layout =   new RelativeLayout(this);


        int height = (int)getResources().getDimension(R.dimen.kolo_height);
        int width = (int)getResources().getDimension(R.dimen.kolo_width);
        int padding = (int)getResources().getDimension(R.dimen.padding);

        ShapeDrawable redShape = new ShapeDrawable(new OvalShape());
        redShape.getPaint().setColor(Color.RED);
        redShape.setIntrinsicHeight(height);
        redShape.setIntrinsicWidth(width);
        redShape.setAlpha(127);

        ImageView oval1 = new ImageView(this);
        oval1.setPadding(padding,padding,padding,padding);
        oval1.setImageDrawable(redShape);

        RelativeLayout.LayoutParams redViewLayoutParams = new
                RelativeLayout.LayoutParams(height,width);
        redViewLayoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        redViewLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        oval1.setLayoutParams(redViewLayoutParams);
        layout.addView(oval1);

        ShapeDrawable redShape2 = new ShapeDrawable(new OvalShape());
        redShape2.getPaint().setColor(Color.YELLOW);
        redShape2.setIntrinsicHeight(height);
        redShape2.setIntrinsicWidth(width);
        redShape2.setAlpha(127);

        ImageView oval2 = new ImageView(this);
        oval2.setPadding(padding,padding,padding,padding);
        oval2.setImageDrawable(redShape2);

        RelativeLayout.LayoutParams redViewLayoutParams2 = new
                RelativeLayout.LayoutParams(height,width);
        redViewLayoutParams2.addRule(RelativeLayout.CENTER_VERTICAL);
        redViewLayoutParams2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        oval2.setLayoutParams(redViewLayoutParams2);
        layout.addView(oval2);

        setContentView(layout);

    }
}
