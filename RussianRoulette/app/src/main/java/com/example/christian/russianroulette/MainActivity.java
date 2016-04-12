package com.example.christian.russianroulette;

import android.gesture.GestureOverlayView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements GestureOverlayView.OnGestureListener{
    String TAG = "kindly_fuck_off";

    ImageView chamber1;
    ImageView chamber2;
    ImageView chamber3;
    ImageView chamber4;
    ImageView chamber5;
    ImageView chamber6;
    ImageView center;
    RelativeLayout relativelo;

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


        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);

        animRotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {


            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation rotate) {

            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onGestureStarted(GestureOverlayView overlay, MotionEvent event) {
        Log.d(TAG, "onGestureStarted: " + overlay );
    }

    @Override
    public void onGesture(GestureOverlayView overlay, MotionEvent event) {
        Log.d("fuck_you", "onGestureStarted: " + overlay );
    }

    @Override
    public void onGestureEnded(GestureOverlayView overlay, MotionEvent event) {
        Log.d("fuck_you_2", "onGestureStarted: " + overlay );
    }

    @Override
    public void onGestureCancelled(GestureOverlayView overlay, MotionEvent event) {
        Log.d("fuck_you_3", "onGestureStarted: " + overlay );
    }
}
