package com.aguirre.intentimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_Explicito;
    Button btn_Implicito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Explicito = findViewById(R.id.btnExplicito);
        btn_Explicito.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                explicito();
            }
        });


        btn_Implicito = findViewById(R.id.btnImplicito);
        btn_Implicito.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                implicito();
            }
        });

    }

    public void implicito(){
        Intent i = new Intent( Intent.ACTION_DIAL, Uri.parse("tel: "+"56912345678"));
        startActivity(i);

    }

    public void explicito(){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }


}