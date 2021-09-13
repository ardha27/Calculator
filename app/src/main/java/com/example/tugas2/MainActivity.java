package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText input1;
    EditText input2;
    Button tambah,kurang,kali,bagi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAll();
    }

    private void getAll() {
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        hasil = (TextView) findViewById(R.id.hasil);

        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);

        tambah.setOnClickListener(this);
        kurang.setOnClickListener(this);
        kali.setOnClickListener(this);
        bagi.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tambah:
                if (isInputValid()) {
                    Toast.makeText(this, "put some number", Toast.LENGTH_SHORT).show();
                } else {
                    hasil.setText(String.valueOf(fungsiTambah()));
                }
                break;
            case R.id.kurang:
                if (isInputValid()) {
                    Toast.makeText(this, "put some number", Toast.LENGTH_SHORT).show();
                } else {
                    hasil.setText(String.valueOf(fungsiKurang()));
                }
                break;
            case R.id.kali:
                if (isInputValid()) {
                    Toast.makeText(this, "put some number", Toast.LENGTH_SHORT).show();
                } else {
                    hasil.setText(String.valueOf(fungsiKali()));
                }
                break;
            case R.id.bagi:
                if (isInputValid()) {
                    Toast.makeText(this, "put some number", Toast.LENGTH_SHORT).show();
                } else {
                    hasil.setText(String.valueOf(fungsiBagi()));
                }
                break;
        }
    }

    public Boolean isInputValid() {
        return input1.getText().toString().isEmpty()||input2.getText().toString().isEmpty();
    }

    public Double fungsiTambah() {
        Double n1 = Double.parseDouble(input1.getText().toString());
        Double n2 = Double.parseDouble(input2.getText().toString());
        return n1+n2;
    }

    public Double fungsiKurang() {
        Double n1 = Double.parseDouble(input1.getText().toString());
        Double n2 = Double.parseDouble(input2.getText().toString());
        return n1-n2;
    }

    public Double fungsiKali() {
        Double n1 = Double.parseDouble(input1.getText().toString());
        Double n2 = Double.parseDouble(input2.getText().toString());
        return n1*n2;
    }

    public Double fungsiBagi() {
        Double n1 = Double.parseDouble(input1.getText().toString());
        Double n2 = Double.parseDouble(input2.getText().toString());
        return n1/n2;
    }
}