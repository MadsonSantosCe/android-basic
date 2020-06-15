package br.ead.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SegundaActivity extends AppCompatActivity {

    private CaraCoroa caraCoroa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        logicaCaraOuCoroa();
    }

    public void logicaCaraOuCoroa(){
        Intent intent = getIntent();
        String texto = intent.getStringExtra("mensagem");
        int opcao = (texto.equals("cara")) ? 0 : 1;
        String msg = "";

        Random gerador = new Random();
        Integer valor = gerador.nextInt(2);
        if(valor == 0){
            caraCoroa = CaraCoroa.CARA;
        } else {
            caraCoroa = CaraCoroa.COROA;
        }

        if (opcao == caraCoroa.getCod()){
            msg = caraCoroa.getDescricao()+" você ganhou!";
        } else {
            msg = caraCoroa.getDescricao()+" você perdeu!";
        }

        TextView textView = (TextView) findViewById(R.id.mensagemRecebida);
        textView.setTextSize(40);
        textView.setText(msg);
    }
}
