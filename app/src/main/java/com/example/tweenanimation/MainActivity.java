package com.example.tweenanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
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
        mTranslateAnim = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
        mTranslateAnim.setAnimationListener(this);
        mImageView.startAnimation(mTranslateAnim);
    }

    public void scaleAnimation(View view) {
        mScaleAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
        mScaleAnim.setAnimationListener(this);
        mImageView.startAnimation(mScaleAnim);
    }

    public void rotateAnimation(View view) {
        mRotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        mScaleAnim.setAnimationListener(this);
        mImageView.startAnimation(mRotateAnim);
    }

    public void alphaAnimation(View view) {
        mAlphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        mAlphaAnim.setAnimationListener(this);
        mImageView.startAnimation(mAlphaAnim);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
