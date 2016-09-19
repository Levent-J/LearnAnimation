package com.levent_j.learnanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

public class Main2Activity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView= (RecyclerView) findViewById(R.id.rv_demo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_item);
//        LayoutAnimationController controller = new LayoutAnimationController(animation);
//        controller.setDelay(0.5f);
//        controller.setOrder();
//        recyclerView.setLayoutAnimationListener();
        DemoAdapter adapter = new DemoAdapter(this);
        recyclerView.setAdapter(adapter);
    }
}
