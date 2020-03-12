package com.pegadaian.vms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

//    ViewFlipper Flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Flipper = findViewById(R.id.flippermain);
//        int images[] = {R.drawable.gadai1, R.drawable.gadai2, R.drawable.gadai3};
//
//        for(int image:images){
//            SliderImages(image);
//        }
    }

//     public void SliderImages(int image){
//         ImageView imageView = new ImageView(this);
//         imageView.setBackgroundResource(image);
//         Flipper.addView(imageView);
//         Flipper.setFlipInterval(3000);
//         Flipper.setAutoStart(true);
//         Flipper.setInAnimation(this, android.R.anim.slide_in_left);
//         Flipper.setOutAnimation(this, android.R.anim.slide_out_right);
//     }
}
