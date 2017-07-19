package com.guozhe.android.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Animation animation = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),WindmillActivity.class);
                startActivity(intent);
            }
        });


    }
    public void trans(View v){
        animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.trans);
        imageView.startAnimation(animation);
    }
    public void rotate(View v){
        animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotat);
        imageView.startAnimation(animation);
    }
    public void scale(View v){
        animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
        imageView.startAnimation(animation);
    }
    public void alpha(View v){
        animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
        imageView.startAnimation(animation);
    }
}
