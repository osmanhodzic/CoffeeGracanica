package com.example.coffeegracanica;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class DetaljiActivity extends AppCompatActivity {

    private TextView tvDetalji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalji);

        tvDetalji = findViewById(R.id.tv_detalji);

        String cafeName = getIntent().getStringExtra("cafe_name");

        // Primjer podataka
        HashMap<String, String> detaljiMap = new HashMap<>();
        detaljiMap.put("Dnevna", "Dnevna Soba - moderan ambijent, idealno za doručak i kafu. \n\nŠta se dogodi kad se ostvare dugogodišnji snovi možete vidjeti u novootvorenom kafiću Dnevna soba. Naime, coffee ponuda u Gračanici od ovog proljeća je bogatija za novu lokaciju u ulici Branilaca grada bb gdje ćete se osjećati opušteno, skriveno od užurbanosti grada, bez obzira radilo li se o jutru ili večeri. Ovaj kafić je našu pažnju privukao zanimljivim uređenjem interijera, a da se ne radi o jednostavnom kafiću svjedoči činjenica da se u prvih nekoliko sedmica rada nižu samo pohvale i odlične preporuke. Saznali smo da osim u kafi ovdje možete uživati i u prefinim kroasanima, mljac doručku i muffinima. \n" +
                "\n" +
                "Salate sa avokadom i zobene pahuljice i apsolutni hit u ponudi je Slani kroasan - integralni kroasan sa namazom od avokada i feta sira sa kuhanim jajetom i salatom od rukole i cherry paradajza. Ako pričamo o slatkišima, onda mafin sa borovnicama definitivno morate probati. Što se tiče pića, pored standardnih izdanja kofeinskih napitaka, u ponudi su i neobičnije varijante poput pink latte-a, hladna kafa sa bijelom čokoladom, ali je karamel latte ubjedljivi pobjednik.\n");
        detaljiMap.put("Excellent", "Excellent Cafe - luksuzni enterijer, odličan izbor kolača.\n\nExcellent caffe je omiljeno mjesto za opuštanje, uživanje u vrhunskoj kafi i druženje. Gostima se posebno dopadaju ljubazno osoblje i ugodna atmosfera – kolokvijalno rečeno, u razgovorima se navodi: „ples … osoblje je ugodno, a atmosfera je komforna“. Excellent caffe radi svakog dana od 7 h do 23 h, pružajući opcije za doručak, brunch, kafu za ponijeti i dostavu (takeaway, delivery). \n Iz ponude izdvajamo: \n\nMini tart sa limunom i kokosom – osvježavajuće, lagano, idealno uz espresso.\n Cheesecake s preljevom od manga – kremasti desert s tropskom notom svježe pirea od manga.\nBorovnica crostata – rustični kolač s mekanim tijestom i sočnim, slatko-kiselim filom od borovnica.\n\nHladni NES s kokosom – ledena kofeinska eksplozija s kokosovim mlijekom i prstohvatom šećera; tropski povjetarac u čaši.\nEspresso tonic s mentom – osvježavajući spoj, gdje kiselkasti tonik harmonizira s bogatim espresso ukusom i daškom mente.\nAffogato pistacija – espresso s kuglicom sladoleda od pistacije — savršen spoj toplog, hladnog i kremastog. ");
        detaljiMap.put("Times Square 92", "Times Square 92 je šarmantni kafić otvoren u središtu Gračanice - idealan za jutarnju kafu, opuštajući popodnevni break ili druženje pod zvjezdanim nebom.\nUdobni drveni stolovi i mekane jastučići pozivaju na duže zadržavanje. Ukrasi poput niske rasvjete i grafika slikanih pločica dočaravaju spoj modernog dizajna i tradicionalnog duha.\n\nIz ponude izdvajamo:\n\nKlasični espresso\nMeki cappuccino sa cimetom\nIced latte s karamelom\nSvježe cijeđeni sok od narandze i grejpfruta\nLedeni čajevi: breskva-mint, limun-đumbir\nPremium vina\nLiker od gljiva, rakija od dunje, whisky selekcija\n\nKokteli\nYa Signature Spritz – špricer s ružinom vodicom, soda i menta list\nTimes Square Fizz – kombinacija gin-tonika s dodatkom borovnice i tonikom od lavande\nCoconut Chill – kokosova tekućina, rum, svježi ananas i soda\n");
        detaljiMap.put("Kafeterija", "Kafeterija je udoban i moderan kutak u kojem se miris svježe mljevene kafe savršeno stapa s toplom, prijateljskom atmosferom. Prostrana terasa nudi predivan pogled na centar Gračanice, stvarajući idealno mjesto za opuštanje i razgovor. Bilo da dođeš sam, s prijateljima ili poslovnim partnerima, ovo je prostor u kojem se kafa ispija polako i s užitkom.\n\nIz ponude izdvajamo:\n\nDoppio – dupla doza espressa za snažan početak dana\n" +
                "Cappuccino – savršen balans espressa, mlijeka i pjene, posut kakaom\n" +
                "Frappe Classic – osvježavajući miks instant kafe, leda i mlijeka\n" +
                "Affogato – kuglica sladoleda prelivena vrućim espressom\n" +
                "Pumpkin Spice Latte – sezonska jesenska poslastica s bundevom, cimetom i muškatnim oraščićem\n" +
                "Biscoff Latte – latte s kremom od poznatog Lotus keksa i šlagom\n" +
                "Tiramisu Mocha – kafa inspirisana popularnim desertom, s mascarpone kremom i kakaom\n");
        detaljiMap.put("NO NAME", "No Name Cafe Bar je moderan i živopisan prostor u kojem se spojila opuštena atmosfera i urbani dizajn. U unutrašnjosti dominiraju udobna sjedišta, topla rasvjeta i detalji koji stvaraju prijatan osjećaj doma. Gosti mogu uživati uz veliki TV ekran na kojem se često puštaju muzički i zabavni show programi, a za ljubitelje dobre zabave tu je i bilijarski sto koji unosi dodatnu dinamiku. Sve je upotpunjeno modernim dekorom i muzikom koja poziva na dobro raspoloženje, bilo da si došao na jutarnju kafu, večernji koktel ili vikend druženje.\n\nIz ponude izdvajamo:\n\nIced Latte, Frappe, Cold Brew s vanilijom\n" +
                "Cajevi: Voćni mix (šumsko voće, nar, borovnica)\n" +
                "Svježe cijeđeni sokovi (narandža, grejp, mix)\n" +
                "Whisky, Gin, Vodka selekcija\n" +
                "Rakije (šljiva, dunja, kajsija, medovača)\n" +
                "Crna, bijela i rose vina\n" +
                "Mojito (klasični, jagoda, mango)\n" +
                "Aperol Spritz\n" +
                "Blue Lagoon");
        detaljiMap.put("Film caffe bar", "Film Cafe Bar je jedinstveno mjesto u kojem se ljubav prema kafi i piću spaja s magijom filmskog svijeta. Zidovi su ukrašeni posterima legendarnih filmova i scenama iz kultnih klasika, a rasvjeta je postavljena tako da podsjeća na atmosferu kino sale. Veliki TV ekrani i projektor često prikazuju filmske projekcije, muzičke spotove ili sportske događaje, čineći svaku posjetu posebnim iskustvom. Opuštena muzika, udobna sjedišta i dekor u retro-Hollywood stilu stvaraju osjećaj da si na filmskom setu – samo s boljim koktelima.\n\nIzdvajamo:\n\nMocha\n" +
                "Caramel Latte\n" +
                "Biscoff Latte\n" +
                "Affogato\n" +
                "Hladni NES s kokosom\n" +
                "Zeleni, crni i voćni čajevi\n" +
                "Ledeni čajevi (breskva, limun, jagoda)\n" +
                "Smoothie (mango-banana, borovnica-vanilija)\n" +
                "Espresso Martini\n" +
                "Tequila Sunrise");
        detaljiMap.put("ETNA", "Etna Gračanica je moderno uređeno mjesto koje odiše toplinom i prijatnom atmosferom. Enterijer kombinuje drvo, toplu rasvjetu i elegantne detalje, dok prostrana terasa pruža savršeno mjesto za uživanje tokom sunčanih dana. Idealno je za jutarnju kafu, popodnevno opuštanje ili večernje druženje uz bogat izbor koktela i pića. Ljubazno osoblje i pažljivo odabrana muzika dodatno upotpunjuju doživljaj, čineći svaku posjetu posebnim.\n\nPonuda pica:\n\nCappuccino\n" +
                "Latte Macchiato\n" +
                "Flat White\n" +
                "Gazirana pića\n" +
                "Ledeni caj\n" +
                "Prirodni sokovi\n" +
                "Pivo (toceno i flasirano)\n" +
                "Vino (crno i bijelo)\n" +
                "Whisky\n" +
                "Gin\n" +
                "Vodka\n" +
                "Kokteli");
        detaljiMap.put("IQ CLUB", "IQ Club u Gračanici je moderno i elegantno mjesto koje spaja opuštenu atmosferu s notom luksuza. Prostor je uređen u savremenom stilu s udobnim sjedištima, ambijentalnim svjetlima i detaljima koji pozivaju na druženje. Veliki TV ekrani, dobra muzika i mogućnost gledanja sportskih događaja stvaraju odličan ugođaj, dok ljubitelji društvenih igara i bilijara ovdje mogu pronaći svoju zabavu. Idealno je mjesto za večernji izlazak, koktel s prijateljima ili opuštanje uz vrhunsku kafu tokom dana.\n\nPonuda:\n\nCappuccino sa cimetom ili kakaom\n" +
                "Irish Coffee (s whiskeyjem i šlagom)\n" +
                "Cold Brew s limunom i tonikom\n" +
                "Detox voda s krastavcem, limunom i mentom\n" +
                "Tequila reposado i silver\n\nKokteli:\n\nIQ Signature\n" +
                "Brainstorm\n" +
                "Dark & Stormy \n" +
                "Mojito Passion");

        // Prikaz teksta
        if (detaljiMap.containsKey(cafeName)) {
            tvDetalji.setText(detaljiMap.get(cafeName));
        } else {
            tvDetalji.setText("Detalji nisu dostupni.");
        }
    }
}
