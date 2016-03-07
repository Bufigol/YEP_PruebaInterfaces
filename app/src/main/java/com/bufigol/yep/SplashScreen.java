package com.bufigol.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        cambiarFont();
        openApp();
    }
    private void cambiarFont() {
        TextView myTitle = (TextView)findViewById(R.id.Title);
        TextView mySubtitle = (TextView)findViewById(R.id.subTitle);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubtitle.setTypeface(myFont);
    }
    /**
     * Metodo que tiene como finalidad de realizar el intent al layout para el inicio de sesión luego
     * de 2 segundos.
     *
     */
    private void openApp() {
        Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        findViewById(R.id.Title).startAnimation(shake);
        findViewById(R.id.subTitle).startAnimation(shake);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashScreen
                            .this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 3000);
    }
}
