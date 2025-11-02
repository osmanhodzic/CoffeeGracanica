package com.example.coffeegracanica;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

    private EditText searchBar;
    private LinearLayout cafeContainer;
    private ArrayList<Cafe> cafes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        searchBar = findViewById(R.id.search_bar);
        cafeContainer = findViewById(R.id.cafe_container);


        cafes = new ArrayList<>();
        cafes.add(new Cafe("Dnevna", R.drawable.dnevna));
        cafes.add(new Cafe("Excellent", R.drawable.excellent));
        cafes.add(new Cafe("Times Square 92", R.drawable.square));
        cafes.add(new Cafe("Kafeterija", R.drawable.kafeterija));
        cafes.add(new Cafe("NO NAME", R.drawable.noname));
        cafes.add(new Cafe("Film caffe bar", R.drawable.film));
        cafes.add(new Cafe("ETNA", R.drawable.etna));
        cafes.add(new Cafe("IQ CLUB", R.drawable.iq));



        // Prikaz svih kafića
        displayCafes(cafes);

        // Filtriranje po tekstu
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterCafes(s.toString());
            }
            @Override public void afterTextChanged(Editable s) {}
        });
    }

    //
    private void displayCafes(ArrayList<Cafe> cafeList) {
        cafeContainer.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(this);

        for (final Cafe cafe : cafeList) {
            View itemView = inflater.inflate(R.layout.cafe_item, cafeContainer, false);
            ImageView cafeImage = itemView.findViewById(R.id.cafe_image);
            TextView cafeNameText = itemView.findViewById(R.id.cafe_name);

            cafeImage.setImageResource(cafe.getImageRes());
            cafeNameText.setText(cafe.getName());

            // Klik na sliku otvara PopupMenu
            setImageClickMenu(cafeImage, cafe.getName());

            cafeContainer.addView(itemView);
        }
    }

    // Filtriranje
    // Filtriranje
    private void filterCafes(String text) {
        if (text == null) text = "";
        String query = text.trim().toLowerCase();

        if (query.isEmpty()) {
            displayCafes(cafes);
            return;
        }

        ArrayList<Cafe> filteredList = new ArrayList<>();
        for (Cafe cafe : cafes) {
            // Poređenje od početka stringa
            if (cafe.getName().toLowerCase().startsWith(query)) {
                filteredList.add(cafe);
            }
        }
        displayCafes(filteredList);
    }


    // Postavi PopupMenu za svaki ImageView
    private void setImageClickMenu(ImageView imageView, final String cafeName) {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(HomePage.this, imageView);


                popup.getMenuInflater().inflate(R.menu.menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        return handleMenuClick(item, cafeName);
                    }
                });

                popup.show();
            }
        });
    }


    private boolean handleMenuClick(MenuItem item, String cafeName) {
        int id = item.getItemId();

        if (id == R.id.action_view) { // Detalji
            startActivity(new Intent(HomePage.this, DetaljiActivity.class)
                    .putExtra("cafe_name", cafeName));
            return true;

        } else if (id == R.id.action_dnevnik) { // Adresa - otvara Google Maps
            String locationQuery = "";

            if (cafeName.equals("Dnevna")) {
                locationQuery = "Dnevna Caffe, Gračanica";
            } else if (cafeName.equals("Excellent")) {
                locationQuery = "Excellent Caffe, Gračanica";
            } else if (cafeName.equals("Times Square 92")) {
                locationQuery = "Times Square 92, Gračanica";
            } else if (cafeName.equals("Kafeterija")) {
                locationQuery = "Kafeterija, Gračanica";
            } else if (cafeName.equals("NO NAME")) {
                locationQuery = "No Name Caffe, Gračanica";
            } else if (cafeName.equals("Film caffe bar")) {
                locationQuery = "Film caffe bar, Gračanica";
            } else if (cafeName.equals("ETNA")) {
                locationQuery = "Etna Caffe, Gračanica";
            } else if (cafeName.equals("IQ CLUB")) {
                locationQuery = "IQ Club, Gračanica";
            } else {
                locationQuery = cafeName + ", Gračanica";
            }

            Intent mapIntent = new Intent(Intent.ACTION_VIEW,
                    android.net.Uri.parse("geo:0,0?q=" + android.net.Uri.encode(locationQuery)));
            mapIntent.setPackage("com.google.android.apps.maps");

                startActivity(mapIntent);

            return true;

        } else if (id == R.id.action_delete) { // Meni
            startActivity(new Intent(HomePage.this, MenuActivity.class)
                    .putExtra("cafe_name", cafeName));
            return true;

        } else if (id == R.id.action_chat) { // Recenzije
            startActivity(new Intent(HomePage.this, RecenzijeActivity.class)
                    .putExtra("cafe_name", cafeName));
            return true;
        }

        return false;
    }




    public static class Cafe {
        private String name;
        private int imageRes;

        public Cafe(String name, int imageRes) {
            this.name = name;
            this.imageRes = imageRes;
        }

        public String getName() { return name; }
        public int getImageRes() { return imageRes; }
    }
}
