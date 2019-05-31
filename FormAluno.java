package com.example.newacademic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormAluno extends AppCompatActivity {
    EditText editNome, editEndereco, editEstado, editMunicipio, editEmail, editSenha;
    Button BtnGravar;
    long retornoDB;

    Aluno aluno, alunoCadastrado;
    AlunoDados alunoDados;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pessoa);

        Intent i = getIntent();

        alunoCadastrado = (Aluno) ((Intent) i).getSerializableExtra("Aluno Cadastrado");
        aluno = new Aluno();
        alunoDados = new AlunoDados(FormAluno.this);

        editNome = (EditText) findViewById(R.id.editNome);
        editEndereco = (EditText) findViewById(R.id.editEndereco);
        editEstado = (EditText) findViewById(R.id.editEstado);
        editMunicipio = (EditText) findViewById(R.id.editMunicipio);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editSenha = (EditText) findViewById(R.id.editSenha);
        BtnGravar = (Button) findViewById(R.id.btnGravar);

        if(alunoCadastrado !=null){
            BtnGravar.setText("Alterar");
        }else{
            BtnGravar.setText("Salvar");
        }


        BtnGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aluno.setNome(editNome.getText().toString());
                aluno.setEndereco(editEndereco.getText().toString());
                aluno.setEstado(editEstado.getText().toString());
                aluno.setMunicipio(editMunicipio.getText().toString());
                aluno.setEmail(editEmail.getText().toString());
                aluno.setSenha(editSenha.getText().toString());

                if (BtnGravar.getText().toString().equals("Salvar")){

                    retornoDB = alunoDados.salvarAluno(aluno);
                    if (retornoDB == -1){
                        alerta("Erro ao cadastrar");
                    }else{
                        alerta("Cadastro realizado com sucesso");
                    }

                }else{

                }


                finish();

            }
        });

    }

    private void alerta (String s){
        Toast.makeText(this,s, Toast.LENGTH_LONG).show();
    }
}
