package com.galen.importantbusinessproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Picasso.get().setLoggingEnabled(true);

        setContentView(R.layout.activity_scroll_testing);

        ViewPager2 viewPager2 = findViewById(R.id.bigviewpager);
        MultiScrollContentAdapter adapter = new MultiScrollContentAdapter();
        viewPager2.setAdapter(adapter);
        viewPager2.setOffscreenPageLimit(2);
    }
}