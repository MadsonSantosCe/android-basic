package br.ead.layoutfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.list_item);
        ArrayList<String> nomes = preencherNomes();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> adapter, View view, int posicao, long id) {

                switch (posicao){
                    case 0:
                        Frag1 fragmento1 = new Frag1();
                        FragmentTransaction transition1 = getSupportFragmentManager().beginTransaction();
                        transition1.replace(R.id.frame_frag, fragmento1);
                        transition1.commit();
                        break;

                    case 1:
                        Frag2 fragmento2 = new Frag2();
                        FragmentTransaction transition2 = getSupportFragmentManager().beginTransaction();
                        transition2.replace(R.id.frame_frag, fragmento2);
                        transition2.commit();
                        break;

                    case 2:
                        Frag3 fragmento3 = new Frag3();
                        FragmentTransaction transition3 = getSupportFragmentManager().beginTransaction();
                        transition3.replace(R.id.frame_frag, fragmento3);
                        transition3.commit();
                        break;
                }
            }
        });
    }

    private ArrayList<String> preencherNomes() {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("José");
        return nomes;
    }
}
