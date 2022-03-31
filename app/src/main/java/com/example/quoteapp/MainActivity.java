package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.quoteapp.adpater.QuoteAdpter;
import com.example.quoteapp.model.quotemodel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<quotemodel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


       quotemodel quotemodel = new quotemodel("खुद पर भरोसा करने का हुनर सीख लो. सहारे कितने भी\n" +
               "\n" +
               "भरोसेमंद हो, एक दिन साथ छोड़ ही जाते है!!");

       quotemodel quotemodel1 = new quotemodel("जीवन में शांति चाहते हैं तो दुसरों की शिकायतें करने से बेहतर है खुद को बदल लें।\n" +
               "\n" +
               "क्योंकि पुरी दुनिया में कारपेट बिछाने से खुद के पैरों में चप्पल पहन लेना अधिक सरल है।");

       quotemodel quotemodel2 = new quotemodel("अकेले ही तय करने होते हैं कुछ सफर;\n" +
               "\n" +
               "ज़िंदगी के हर सफर में हमसफ़र नहीं मिला करते!");

       quotemodel quotemodel3 = new quotemodel("अजीब दस्तूर है ज़माने का,\n" +
               "\n" +
               "अच्छी यादें पेनड्राइव में\n" +
               "\n" +
               "और बुरी यादें दिल में रखते है.!");

       list.add(quotemodel);
       list.add(quotemodel1);
       list.add(quotemodel2);
       list.add(quotemodel3);

        RecyclerView recyclerView = findViewById(R.id.recycleapp);
        LinearLayoutManager layoutManager  = new LinearLayoutManager(getApplicationContext());
        QuoteAdpter quoteAdpter = new QuoteAdpter(list , getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(quoteAdpter);
    }
}