package com.si5a.mashupmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class DetailActivity extends AppCompatActivity {
    private TextView tvJudul, tvKeterangan, tvVideoid;
    private YouTubePlayerView ypvVideo;
    private Button btnKembali;
    private String judul, keterangan, videoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.tv_judul);
        tvKeterangan = findViewById(R.id.tv_keterangan);
        tvVideoid = findViewById(R.id.tv_videoid);
        ypvVideo = findViewById(R.id.ypv_video);
        btnKembali = findViewById(R.id.btnKembali);

        Intent intent = getIntent();
        judul = intent.getStringExtra("varJudul");
        keterangan = intent.getStringExtra("varKeterangan");
        videoid.getSt
    }
}