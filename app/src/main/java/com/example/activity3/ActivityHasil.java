package com.example.activity3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    //mendeklarasikan var dgn tipe data Textview
    TextView txtEmail, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //menghubungkan var txtEmail dengan componen TextView pada Layout
        txtEmail=findViewById(R.id.tvEmail);

        //menghubungkan var txtPassword dengan componen TextView pada Layout
        txtPassword=findViewById(R.id.tvPassword);

        //mendeklarasikan var bundle yg akan digunakan untuk mengambil pesan yg dikirimkan melalui
        //method intent
        Bundle bundle = getIntent().getExtras();

        //membuat var string yg adigunakan untuk menyimpan data yg dikirimkan dari activity sblmnya
        //dengan kunci "a"
        String email = bundle.getString("a");

        //membuat var string yg adigunakan untuk menyimpan data yg dikirimkan dari activity sblmnya
        //dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txtEmail
        txtEmail.setText(email);

        //menampilkan value dari variabel email kedalam txtPassword
        txtPassword.setText(pass);


    }
}