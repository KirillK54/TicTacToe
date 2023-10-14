package ru.mnm.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    Button reset;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        reset = findViewById(R.id.reset);

        sharedPreferences = this.getSharedPreferences("krestikNolik", Context.MODE_PRIVATE );
        editor = sharedPreferences.edit();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putInt("PointsOfPlayer", 0);
                editor.putInt("PointsOfPC", 0);
                editor.apply();
                Toast.makeText(SettingsActivity.this, "Счёт сброшен", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void onBackPressed() {
        startActivity(new Intent(SettingsActivity.this, MainActivity.class));
        finish();
    }

    public void onBackClick(View view) {
        startActivity(new Intent(SettingsActivity.this, MainActivity.class));
        finish();
    }


}