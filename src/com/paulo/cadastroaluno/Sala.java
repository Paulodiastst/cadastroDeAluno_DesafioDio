package com.paulo.cadastroaluno;

import java.util.ArrayList;

public class Sala {
    ArrayList<Aluno> listaDeAlunos;

    public Sala() {
        this.listaDeAlunos = new ArrayList<>();
    }

    void insereAluno(Aluno novoAluno) {
        novoAluno.calculaNotas();
        listaDeAlunos.add(novoAluno);
    }

    void listarAlunos() {
        System.out.println("\nLista de alunos");

        for (Aluno alunoNaLista:listaDeAlunos) {
            alunoNaLista.listar();
        }
    }

    void listarSituacoes() {
        System.out.println("\nSituacoes");

        for (Aluno alunoNalista:listaDeAlunos) {
            alunoNalista.mostraSituacao();
        }
    }

}
