package com.example.coffeegracanica;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;

public class MenuActivity extends AppCompatActivity {
    private TextView tvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvMenu = findViewById(R.id.tv_menu);
        String cafeName = getIntent().getStringExtra("cafe_name");

        HashMap<String, String> menuMap = new HashMap<>();
        menuMap.put("Dnevna", "Kafa - 3 - 6 KM\nČaj - 3.5 KM\nKroasan - 4.5 KM\nMuffin 3 KM\nZobene pahuljice - 5 KM\nSlani kroasan - 4 KM\nSalata s avokadom - 6 KM");
        menuMap.put("Excellent", "Espresso - 2.5 KM\nLatte - 3 KM\nCheesecake - 4 KM\nMini tart s limunom - 4 KM\nBorovnica crostata - 5 KM\nNES - 3 KM\nEspresso tonis s mentom - 4.5 KM\nAffogato pistacija - 5.5 KM");
        menuMap.put("Times Square 92", "Burger - 6 KM\nPomfrit - 3 KM\nCoca-Cola - 3.5 KM\nCappucino - 3.5 - 5.5 KM\nIced latte s karamelom - 4 KM\nLedeni cajevi - 3 KM\nPremium vina - 10 - 20 KM\nLiker od gljiva - 7 KM\nCoconut Chill - 8 KM");
        menuMap.put("Kafeterija", "Kafa - 3 KM\nMacchiato - 2.5 KM\nCappucino - 4 KM\nFrappe Classic - 4 KM\nPumpkin Spice Latte - 6 KM\nBiscoff Latte - 5 KM\nTiramisu Mocha - 6 KM");
        menuMap.put("NO NAME", "Iced Latte - 4 KM\nČaj - 3.5 KM\nSvjeze cijedjeni sokovi - 6 KM\nWhiskey - 5 KM\nRakija - 3 - 6 KM\nMojito - 8 KM");
        menuMap.put("Film caffe bar", "Mocha - 3 KM\nCaramel Latte - 4 KM\nAffogato - 3 KM\nNES s kokosom - 3 KM\nCajevi - 3 KM\nLedeni cajevi - 3.5 KM\n Smoothie - 6 KM");
        menuMap.put("ETNA", "Cappucino - 4 KM\nKafa - 2 KM\nSok - 3.5 KM\nPrirodni sokovi - 5 KM\nGin - 7 KM\nKokteli - 10 KM");
        menuMap.put("IQ CLUB", "Cappucino s cimetom - 5 KM\nIrish Coffe - 4 KM\nCold Brew s limunom i tonikom - 5 KM\nDetox voda s krastavicom, limunom i mentom - 4 KM\nKokteli - 7 KM");

        if (menuMap.containsKey(cafeName)) {
            tvMenu.setText(menuMap.get(cafeName));
        } else {
            tvMenu.setText("Meni nije dostupan.");
        }
    }
}
