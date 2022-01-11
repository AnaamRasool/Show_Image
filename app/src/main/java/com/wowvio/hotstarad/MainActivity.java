package com.wowvio.hotstarad;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.wowvio.show_image.Show;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        imageView = findViewById(R.id.iv);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" +
                R.raw.video));
        videoView.start();

        String[] s = new String[]{
                "https://assets.ajio.com/medias/sys_master/root/20210909/eLAe/613a2b98f997ddce89c304dd/teamspirit_green_zip-front_puffer_jacket_with_zip_pockets.jpg"
                , "https://assets.ajio.com/medias/sys_master/root/hc8/hf9/11914308223006/campus_sutra_black_hooded_quilted_jacket.jpg"
                , "https://assets.ajio.com/medias/sys_master/root/20210615/sn78/60c7a17bf997ddb312c8f7ef/netplay_navy_blue_zip-front_puffer_jacket_with_insert_pockets.jpg"
                , "https://assets.ajio.com/medias/sys_master/root/20210909/AQhs/613a25f97cdb8cb8241f367f/teamspirit_grey_zip-front_puffer_jacket_with_zip_pockets.jpg"
                , "https://assets.ajio.com/medias/sys_master/root/20211026/PmjJ/6176fd75aeb2690110a887bd/dnmx_red_zip-front_jacket_with_insert_pockets.jpg"};

        Show show = new Show();
        show.showImage(videoView, imageView, s, this);


    }
}
