package com.wowvio.show_image;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

public class Show {

    public void showImage(VideoView videoView, ImageView imageView, String[] s, Context context) {
        Handler mHandler = new Handler();
        //Make sure you update Seekbar on UI thread
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {

                imageView.setVisibility(View.VISIBLE);
                int c = videoView.getCurrentPosition();
                if (c > 10000 && c < 15000) {
                    Glide.with(context).load(s[0]).into(imageView);
                    mHandler.postDelayed(this, 5000);
                } else if (c > 20000 && c < 25000) {
                    Glide.with(context).load(s[1]).into(imageView);
                } else if (c > 30000 && c < 35000) {
                    Glide.with(context).load(s[2]).into(imageView);
                } else if (c > 40000 && c < 45000) {
                    Glide.with(context).load(s[3]).into(imageView);
                } else if (c > 50000 && c < 55000) {
                    Glide.with(context).load(s[4]).into(imageView);
                } else {
                    imageView.setVisibility(View.GONE);
                }

                mHandler.postDelayed(this, 0);
            }
        }, 0);
    }
}
