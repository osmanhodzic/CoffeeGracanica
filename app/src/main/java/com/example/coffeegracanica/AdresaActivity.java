package com.example.coffeegracanica;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;

public class AdresaActivity extends AppCompatActivity {
    private TextView tvAdresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adresa);

        tvAdresa = findViewById(R.id.tv_adresa);
        String cafeName = getIntent().getStringExtra("cafe_name");
        if (cafeName != null) {
            cafeName = cafeName.trim();
        }

// mapa
        HashMap<String, String> adresaMap = new HashMap<>();
        adresaMap.put("dnevna", "Branilaca grada bb");
        adresaMap.put("excellent", "Zlatnih ljiljana bb");
        adresaMap.put("times square 92", "TC Evropa, Skver bb");
        adresaMap.put("kafeterija", "Sultan Mehmeda bb");
        adresaMap.put("no name", "Sarajevska bb");
        adresaMap.put("film caffe bar", "111 Gračaničke brigade");
        adresaMap.put("etna", " Branilaca grada bb");
        adresaMap.put("iq club", "Skver bb");

// provjera bez obzira na velika/mala slova
        if (cafeName != null && adresaMap.containsKey(cafeName.toLowerCase())) {
            tvAdresa.setText(adresaMap.get(cafeName.toLowerCase()));
        } else {
            tvAdresa.setText("Adresa nije dostupna.");
        }

    }
}
