package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

import com.example.registro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btRegistrar.setOnClickListener(v -> {

            if (!binding.inputName.getEditText().getText().toString().isEmpty() && !binding.inputApellido.getEditText().getText().toString().isEmpty()
                    && !binding.inputEmail.getEditText().getText().toString().isEmpty() && !binding.inputPassword.getEditText().getText().toString().isEmpty()) {

                String nombre = binding.inputName.getEditText().getText().toString() + " " + binding.inputApellido.getEditText().getText().toString();

                Toast.makeText(this, String.format("Hola %s!", nombre), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show();
            }

        });
    }
}