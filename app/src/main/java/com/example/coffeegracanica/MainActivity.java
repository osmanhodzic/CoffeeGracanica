package com.example.coffeegracanica;

import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    Handler handler = new Handler();

    ImageView imageView1, imageView2;
    int[] backgrounds = {
            R.drawable.coffee1,
            R.drawable.coffee2,
            R.drawable.coffee3,
            R.drawable.coffee4
    };
    int bgIndex = 0;
    boolean showingFirst = true;

    int progress = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        progressBar = findViewById(R.id.progressBar);

        // slideshow start
        startSlideshow();

        // progress bar
        new Thread(() -> {
            while (progress < 100) {
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progress++;
                handler.post(() -> progressBar.setProgress(progress));
            }

            handler.post(() -> {
                Intent intent = new Intent(MainActivity.this, HomePage.class);
                startActivity(intent);
                finish();
            });
        }).start();
    }

    private void startSlideshow() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                bgIndex = (bgIndex + 1) % backgrounds.length;
                crossfade(backgrounds[bgIndex]);
                handler.postDelayed(this, 1000);
            }
        }, 1000);
    }

    private void crossfade(int drawableId) {
        ImageView fadeOutView = showingFirst ? imageView1 : imageView2;
        ImageView fadeInView = showingFirst ? imageView2 : imageView1;

        fadeInView.setImageResource(drawableId);
        fadeInView.setAlpha(0f);
        fadeInView.setVisibility(ImageView.VISIBLE);

        fadeInView.animate().alpha(1f).setDuration(300).start();
        fadeOutView.animate().alpha(0f).setDuration(300).start();

        showingFirst = !showingFirst;
    }
}
