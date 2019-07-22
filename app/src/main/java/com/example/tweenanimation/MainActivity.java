package com.example.tweenanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;
    private Animation mRotateAnim;
    private Animation mScaleAnim;
    private Animation mTranslateAnim;
    private Animation mAlphaAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.volleyball);
    }

    public void translateAnimation(View view) {
    }

    public void scaleAnimation(View view) {
    }

    public void rotateAnimation(View view) {
    }

    public void alphaAnimation(View view) {
    }
}
