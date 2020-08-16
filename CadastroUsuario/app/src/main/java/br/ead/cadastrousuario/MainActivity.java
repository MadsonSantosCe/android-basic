package br.ead.cadastrousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opcaoOnRadioButtonClicked(View view){

    }

    public void onToggleClicked(View view){

    }

    public void btnCadastrarOnClick(View view){
        Context context = view.getContext();
        CharSequence text = "Usuário Cadastrado com Sucesso!";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
