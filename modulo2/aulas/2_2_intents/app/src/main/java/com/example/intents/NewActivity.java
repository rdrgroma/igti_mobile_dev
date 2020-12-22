package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newactivity);

        Intent intent = getIntent();
        String mensagem = intent.getStringExtra(MainActivity.MENSAGEM_ADICIONAL);

        TextView labelName = (TextView)findViewById(R.id.textoSegundaTela);
        labelName.setText(mensagem);
    }

    public void voltaTela(View view) {
        Intent oldScreen = new Intent(this, MainActivity.class);
        startActivity(oldScreen);
    }
}