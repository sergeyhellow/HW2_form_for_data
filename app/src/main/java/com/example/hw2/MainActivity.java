package com.example.hw2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View view) {
        EditText nameEditText = findViewById(R.id.name);
        EditText emailEditText = findViewById(R.id.email);

        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();

        if (!name.isEmpty() && !email.isEmpty()) {
            Toast.makeText(this, "Форма отправлена", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Пожалуйста, заполните все поля", Toast.LENGTH_SHORT).show();
        }
    }
}
