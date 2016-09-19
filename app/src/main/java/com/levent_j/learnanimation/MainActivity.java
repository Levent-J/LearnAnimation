package com.levent_j.learnanimation;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView demo1;
    ImageView demo2;
    ImageView demo3;
    int w=500;

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

        demo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });

        demo3 = (ImageView) findViewById(R.id.iv_demo3);
//        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.property_animator);
//        set.setTarget(demo3);
//        set.start();
        demo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewWrapper wrapper = new ViewWrapper(demo3);
                ObjectAnimator.ofInt(wrapper,"width",w).setDuration(5000).start();
                w+=500;
            }
        });
    }

    static class ViewWrapper{
        private View mTarget;

        public ViewWrapper(View target){
            mTarget=target;
        }

        public int getWidth() {
            return mTarget.getLayoutParams().width;
        }

        public void setWidth(int width) {
            mTarget.getLayoutParams().width=width;
            mTarget.requestLayout();
        }
    }
}
