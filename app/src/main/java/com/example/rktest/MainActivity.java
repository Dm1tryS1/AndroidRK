package com.example.rktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.rktest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(binding.editTextNumber1.getText().toString().isEmpty()) && (!binding.editTextNumber2.getText().toString().isEmpty()))
                {
                    binding.textResult.setText(Integer.toString(Integer.valueOf(binding.editTextNumber1.getText().toString())  + Integer.valueOf(binding.editTextNumber2.getText().toString())));
                    binding.editTextNumber1.setText("");
                    binding.editTextNumber2.setText("");
                    binding.editTextNumber2.setSelected(false);
                }
            }
        });

        binding.buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(binding.editTextNumber1.getText().toString().isEmpty()) && (!binding.editTextNumber2.getText().toString().isEmpty()))
                {
                    binding.textResult.setText(Integer.toString(Integer.valueOf(binding.editTextNumber1.getText().toString())  - Integer.valueOf(binding.editTextNumber2.getText().toString())));
                    binding.editTextNumber1.setText("");
                    binding.editTextNumber2.setText("");
                    binding.editTextNumber2.setSelected(false);
                }
            }
        });

        binding.buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(binding.editTextNumber1.getText().toString().isEmpty()) && (!binding.editTextNumber2.getText().toString().isEmpty()))
                {
                    binding.textResult.setText(Integer.toString(Integer.valueOf(binding.editTextNumber1.getText().toString())  * Integer.valueOf(binding.editTextNumber2.getText().toString())));
                    binding.editTextNumber1.setText("");
                    binding.editTextNumber2.setText("");
                    binding.editTextNumber2.setSelected(false);
                }
            }
        });

        binding.buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(binding.editTextNumber1.getText().toString().isEmpty()) && (!binding.editTextNumber2.getText().toString().isEmpty()))
                {
                    binding.textResult.setText(Integer.toString(Integer.valueOf(binding.editTextNumber1.getText().toString())  / Integer.valueOf(binding.editTextNumber2.getText().toString())));
                    binding.editTextNumber1.setText("");
                    binding.editTextNumber2.setText("");
                    binding.editTextNumber2.setSelected(false);
                }
            }
        });
    }
}