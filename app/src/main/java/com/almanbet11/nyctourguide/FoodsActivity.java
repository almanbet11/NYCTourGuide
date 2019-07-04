package com.almanbet11.nyctourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.almanbet11.nyctourguide.ui.main.FoodsFragment;
import com.almanbet11.nyctourguide.ui.main.SightsFragment;

public class FoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FoodsFragment()).commit();

    }
}
