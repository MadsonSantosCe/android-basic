package br.ead.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void caraOuCoroa(View v){
        EditText txt = (EditText) findViewById(R.id.opcao);
        String msg = txt.getText().toString().toLowerCase();
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("mensagem", msg);
        startActivity(intent);
    }
}
