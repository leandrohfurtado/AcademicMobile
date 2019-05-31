package com.example.newacademic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    ListView listVistivel;
    Button btnCadastro;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listVisivel = (ListView) findViewByID(R.id.listAlunos);
        btnCadastro = (Button) findViewByID(R.id.btnCadastro);

        btnCadastro.setOnClickListener(new View.OnClickListener()){



        @Override

        public void onClick(view v){
                Intent i = new Intent(MainActivity.this, FormAluno.class);
                startActivity(i);
        }
    }};
}
