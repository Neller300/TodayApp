package com.example.today;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button registre_btn = findViewById(R.id.Registre_btn);
        registre_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, RegisterActivity.class);
                startActivity(intent);
                //goToRegisterActivity(v);
            }
        });

        Button profile_btn = findViewById(R.id.Profile_btn);
        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ProfileActivity.class);
                startActivity(intent);
                //goToProfileOverview(v);
            }
        });
    }

    public void goToRegisterActivity(View v){
        Intent intent = new Intent(MenuActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    public void goToProfileOverview(View v){
        Intent intent = new Intent(MenuActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
