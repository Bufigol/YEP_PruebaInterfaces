package com.bufigol.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cambiarFont();
    }
    private void cambiarFont() {
        TextView myTitle = (TextView)findViewById(R.id.Title);
        TextView mySubtitle = (TextView)findViewById(R.id.subTitle);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubtitle.setTypeface(myFont);
    }
    public void irAlMain(View view){
        Intent intent = new Intent(LoginActivity
                .this, Main.class);
        startActivity(intent);
        finish();
    }
}
