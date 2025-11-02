package com.example.coffeegracanica;

import static android.content.Intent.getIntent;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;

public class RecenzijeActivity extends AppCompatActivity {
    private TextView tvRecenzije;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recenzije);

        tvRecenzije = findViewById(R.id.tv_recenzije);
        String cafeName = getIntent().getStringExtra("cafe_name");

        HashMap<String, String> recenzijeMap = new HashMap<>();
        recenzijeMap.put("Dnevna", "⭐⭐⭐⭐⭐\n'Ugodan ambijent i brza usluga.'");
        recenzijeMap.put("Excellent", "⭐⭐⭐⭐⭐\n'Najbolja kafa u gradu!'");
        recenzijeMap.put("Times Square 92", "⭐⭐⭐☆☆\n'Dobro mjesto, ali ponekad gužva.'");
        recenzijeMap.put("Kafeterija", "⭐⭐⭐⭐⭐\n'Savršeno za jutarnju kafu.'");
        recenzijeMap.put("NO NAME", "⭐⭐⭐⭐☆\n'Tiho i mirno mjesto.'");
        recenzijeMap.put("Film caffe bar", "⭐⭐⭐☆☆\n'Ok, ali preskupo.'");
        recenzijeMap.put("ETNA", "⭐⭐⭐⭐⭐\n'Najbolja pizza u gradu.'");
        recenzijeMap.put("IQ CLUB", "⭐⭐⭐☆☆\n'Dobro za izlazak petkom.'");

        if (recenzijeMap.containsKey(cafeName)) {
            tvRecenzije.setText(recenzijeMap.get(cafeName));
        } else {
            tvRecenzije.setText("Recenzije nisu dostupne.");
        }
    }
}
