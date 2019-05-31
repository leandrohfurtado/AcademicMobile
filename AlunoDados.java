package com.example.newacademic;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AlunoDados extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "BDAcademic.db";
    private static final int VERSION = 1;
    private static final String TABELA = "aluno";

    private static final String NOME = "nome";
    private static final String ENDERECO = "endereco";
    private static final String ESTADO = "estado";
    private static final String MUNICIPIO = "municipio";
    private static final String EMAIL = "email";
    private static final String SENHA = "senha";
    private static final String MATRICULA = "matricula";




    public AlunoDados(Context context) {
        super(context, NOME_BANCO, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE" +TABELA+ " ( " +
                " " + MATRICULA+"INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " " + NOME+"TEXT, "+ENDERECO+"TEXT, "+ESTADO+"TEXT, "+MUNICIPIO+"TEXT," +
                " " + EMAIL+"TEXT, "+ SENHA+"TEXT );";

        db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        String sql = "DROP TABLE IS EXISTS " +TABELA;
        db.execSQL(sql);
        onCreate(db);

    }

    public long salvarAluno(Pessoa p){

        ContentValues values = new ContentValues();
        long retornoBD;

        values.put(NOME, p.getNome());
        values.put(ENDERECO, p.getEndereco());
        values.put(ESTADO, p.getEstado());
        values.put(MUNICIPIO, p.getMunicipio());
        values.put(EMAIL, p.getEmail());
        values.put(SENHA, p.getSenha());

        retornoBD = getWritableDatabase().insert(TABELA, null, values);

        return retornoBD;

    }


}
