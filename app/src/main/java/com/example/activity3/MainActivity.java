package com.example.activity3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btlogin;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btlogin = findViewById(R.id.btLogin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "admin@mail.com";
                String pass = "123";

                if (nama.equals(email) && password.equals(pass))
                {
                    Toast ss = Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_LONG);
                    ss.show();

                    //membuat object bundle
                    Bundle b = new Bundle();

                    //memasukkan value dari var nama dengan kunci "a"
                    //dan dimasukkan kedalam bundle
                    b.putString("a", nama.trim());

                    //memasukkan value dari var password dengan kunci "b"
                    //dan dimasukkan kedalam bundle
                    b.putString("b",password.trim());

                    //membuat object intent berpindah activity
                    Intent i = new Intent(getApplicationContext(), com.example.activity3.ActivityHasil.class);

                    //memasukkan bundle kedalam intent untuk dikirmkan ke ActivityHasil
                    i.putExtras(b);

                    //berpindah ke ActivityHasil
                    startActivity(i);

                }
                else if (nama.equals(email) || pass.equals(password))
                {
                    if(nama.equals(email))
                    {
                        Toast ps = Toast.makeText(getApplicationContext(),
                                "Password SALAH", Toast.LENGTH_LONG);
                        ps.show();
                    }
                    else
                    {
                        Toast es = Toast.makeText(getApplicationContext(),
                                "Email SALAH", Toast.LENGTH_LONG);
                        es.show();
                    }
                }
                else if (nama.isEmpty()||password.isEmpty()) {
                    Toast e = Toast.makeText(getApplicationContext(),
                            "Email dan Password wajib diisi!", Toast.LENGTH_LONG);
                    e.show();
                }
                else
                {
                    Toast ss2 = Toast.makeText(getApplicationContext(),
                            "Email dan Password SALAH",Toast.LENGTH_LONG);
                    ss2.show();
                }
            }
        });
    }

}