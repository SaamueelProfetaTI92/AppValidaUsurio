package br.sp.senac.appvalidausurio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class CadastrarTeste extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_teste);

        toolbar = (Toolbar) findViewById(R.id.idTesteToolbar);

        // carregar a toolbar
        setSupportActionBar(toolbar);

        //coloca o icone na barra
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mConfigurações:
                Toast.makeText(getApplicationContext(), "Clique em Configurações", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(), "Clique em Buscar", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
