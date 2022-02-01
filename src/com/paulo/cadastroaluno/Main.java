package com.paulo.cadastroaluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc, qtdNotas;
        float nota = 0;
        String nome, cpf;
        Sala novaSala = new Sala();
        Aluno novoAluno = new Aluno();

        do {
            System.out.println("\n------------------");
            System.out.println("       MENU");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Lista alunos");
            System.out.println("3 - Situações");
            System.out.println("0 - Sair");

            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:
                    System.out.println("\nNome: ");
                    nome = sc.nextLine();
                    System.out.println("\nCPF:");
                    cpf = sc.nextLine();

                    novoAluno = new Aluno(nome, cpf);

                    System.out.println("\nQuantas notas?");
                    qtdNotas = sc.nextInt();

                    for (int i = 0; i < qtdNotas; i++) {
                        System.out.println("\nNota " + (i + 1));
                        nota = sc.nextFloat();
                        novoAluno.insereNotas(nota);
                    }

                    novaSala.insereAluno(novoAluno);

                    break;
                case 2:
                    novaSala.listarAlunos();
                    break;
                case 3:
                    novaSala.listarSituacoes();
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\n Opção inválida!");
            }

        }while (opc != 0);
    }
}
