package com.company.exArray;

import javax.xml.soap.Text;

public class Aluguel {

    String nome;
    String email;
    int room;

    public Aluguel(String nome, String email, int room) {
        this.nome = nome;
        this.email = email;
        this.room = room;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
