package br.ead;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inserirInformacoes(View v){

        EditText nome_esporte = (EditText) findViewById(R.id.nome_esporte);
        EditText nome_time = (EditText) findViewById(R.id.nome_time);
        EditText nome_equipe = (EditText) findViewById(R.id.nome_equipe);
        EditText nome_jogadores = (EditText) findViewById(R.id.nome_jogadores);

        EsportesDAO dao = new EsportesDAO(getApplicationContext());
        Esportes esportes = new Esportes();
        esportes.setNome(nome_esporte.getText().toString());
        esportes.setTime(nome_time.getText().toString());
        esportes.setEquipe(nome_equipe.getText().toString());
        esportes.setJogadores(nome_jogadores.getText().toString());

        dao.insert(esportes);

        //Activity extende Context
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
    }
}
