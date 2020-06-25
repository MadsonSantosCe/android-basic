package br.ead;

import android.text.Editable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;

@DatabaseTable(tableName = "esportes")
public class Esportes {

    @DatabaseField(columnName = "id", generatedId = true)
    private int id;

    @DatabaseField(columnName = "esporte")
    private String nome;

    @DatabaseField(columnName = "time")
    private String Time;

    @DatabaseField(columnName = "equipe")
    private String Equipe;

    @DatabaseField(columnName = "jogadores")
    private String Jogadores;

    public Esportes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getEquipe() {
        return Equipe;
    }

    public void setEquipe(String equipe) {
        Equipe = equipe;
    }

    public String getJogadores() {
        return Jogadores;
    }

    public void setJogadores(String jogadores) {
        Jogadores = jogadores;
    }
}
