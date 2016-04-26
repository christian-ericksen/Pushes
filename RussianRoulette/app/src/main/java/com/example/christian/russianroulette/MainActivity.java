package com.example.christian.russianroulette;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ImageView chamber1;
    ImageView chamber2;
    ImageView chamber3;
    ImageView chamber4;
    ImageView chamber5;
    ImageView chamber6;
    ImageView center;
    Button shoot;
    Button spin;
    //ImageView arrow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chamber1 = (ImageView) findViewById(R.id.chamber1);
        chamber2 = (ImageView) findViewById(R.id.chamber2);
        chamber3 = (ImageView) findViewById(R.id.chamber3);
        chamber4 = (ImageView) findViewById(R.id.chamber4);
        chamber5 = (ImageView) findViewById(R.id.chamber5);
        chamber6 = (ImageView) findViewById(R.id.chamber6);
        center = (ImageView) findViewById(R.id.center);
        shoot = (Button) findViewById(R.id.shoot);
        spin = (Button) findViewById(R.id.spin);
        //arrow = (ImageView) findViewById(R.id.arrow);
        final RelativeLayout relativeLayoutCylinder = (RelativeLayout) findViewById(R.id.relative_layout_cylinder);



       final RotateAnimation rotate1 = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        //RotateAnimation rotate = new RotateAnimation(0, 360, 90, 90);
        rotate1.setDuration(1000);
        rotate1.setInterpolator(new LinearInterpolator());

       final RotateAnimation rotate2 = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate2.setDuration(3000);
        rotate2.setInterpolator(new DecelerateInterpolator());



        chamber1= (ImageView) findViewById(R.id.chamber1);
        chamber2 = (ImageView) findViewById(R.id.chamber2);
        chamber3 = (ImageView) findViewById(R.id.chamber3);
        chamber4 = (ImageView) findViewById(R.id.chamber4);
        chamber5 = (ImageView) findViewById(R.id.chamber5);
        chamber6 = (ImageView) findViewById(R.id.chamber6);

        relativeLayoutCylinder.setPivotX(relativeLayoutCylinder.getWidth() / 2);
        relativeLayoutCylinder.setPivotY(relativeLayoutCylinder.getHeight() / 2);


        spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayoutCylinder.startAnimation(rotate1);
                relativeLayoutCylinder.startAnimation(rotate2);


//                chamber1.startAnimation(rotate);
//                chamber2.startAnimation(rotate);
//                chamber3.startAnimation(rotate);
//                chamber4.startAnimation(rotate);
//                chamber5.startAnimation(rotate);
//                chamber6.startAnimation(rotate);

            }
        });

        shoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });



//        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
//        chamber1.startAnimation(animRotate);
//        chamber1.setPivotX(0);
//        chamber1.setPivotY(0);
//
//        animRotate.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//                chamber1.getPivotX();
//                chamber1.getPivotY();
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation rotate) {
//
//            }
//        });

    }
}