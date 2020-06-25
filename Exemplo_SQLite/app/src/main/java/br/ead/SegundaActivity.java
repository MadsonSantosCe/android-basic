package br.ead;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        EsportesDAO dao = new EsportesDAO(getApplicationContext());
        List<Esportes> ListaEsportes = dao.getAll();

        String nomeEsporte = " ";

        for (Esportes obj : ListaEsportes) {
            nomeEsporte = obj.getNome();
        }

        TextView textView = (TextView) findViewById(R.id.mensagem);
        textView.setTextSize(40);
        textView.setText(nomeEsporte + " cadastrado com sucesso!!!");
    }
}
