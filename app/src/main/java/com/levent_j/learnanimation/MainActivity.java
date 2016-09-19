package com.levent_j.learnanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView demo1;
    ImageView demo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        demo1 = (ImageView) findViewById(R.id.iv_demo1);
        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.demo1);
        animation1.setDuration(5000);
        demo1.startAnimation(animation1);

        demo2 = (ImageView) findViewById(R.id.iv_demo2);
        demo2.setBackgroundResource(R.drawable.anim2);
        AnimationDrawable drawable = (AnimationDrawable) demo2.getBackground();
        drawable.start();
    }
}
