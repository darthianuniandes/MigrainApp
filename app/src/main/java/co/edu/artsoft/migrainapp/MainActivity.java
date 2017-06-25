package co.edu.artsoft.migrainapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.edu.artsoft.migrainapp.controller.ConsumoRest;
import co.edu.artsoft.migrainapp.recording.Recording;

public class MainActivity extends AppCompatActivity {

    Button btnInvocar;
    Button btnGrabar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInvocar =  (Button) findViewById(R.id.btnInvocar);
        btnGrabar = (Button) findViewById(R.id.btnGrabar);

        btnInvocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage(v);
            }
        });

        btnGrabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grabar(v);
            }
        });

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, ConsumoRest.class);
        startActivity(intent);
    }

    public void grabar(View view) {
        Intent intent = new Intent(this, Recording.class);
        startActivity(intent);
    }
}
