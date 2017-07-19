package com.guozhe.android.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

public class WindmillActivity extends AppCompatActivity implements View.OnClickListener{

    private Button start;
    private RelativeLayout windmill;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windmill);
        initView();
    }

    private void initView() {
        start = (Button) findViewById(R.id.start);
        windmill = (RelativeLayout) findViewById(R.id.windMill);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        start.setOnClickListener(this);
        windmill.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start:
                Animation trans1 = AnimationUtils.loadAnimation(WindmillActivity.this, R.anim.trans1);
                Animation trans2 = AnimationUtils.loadAnimation(WindmillActivity.this, R.anim.trans2);
                Animation trans3 = AnimationUtils.loadAnimation(WindmillActivity.this, R.anim.trans3);
                Animation trans4 = AnimationUtils.loadAnimation(WindmillActivity.this, R.anim.trans4);
                Animation rotate = AnimationUtils.loadAnimation(WindmillActivity.this, R.anim.rotate_windmill);

                button1.startAnimation(trans1);
                button2.startAnimation(trans2);
                button3.startAnimation(trans3);
                button4.startAnimation(trans4);
                windmill.startAnimation(rotate);
                break;
            case R.id.windMill:
                Intent intent = new Intent(this, AniActivity.class);
                startActivity(intent);
        }
    }
}