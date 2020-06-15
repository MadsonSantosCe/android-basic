package dell.ead;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class CicloLogActivity extends AppCompatActivity {

    private static final String FILTRO = "CicloLogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(FILTRO, "Método OnStart Chamado!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(FILTRO, "Método OnResume Chamado!");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(FILTRO, "Método OnPause Chamado!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(FILTRO, "Método OnStop Chamado!");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(FILTRO, "Método OnDestroy Chamado!");
    }

}
