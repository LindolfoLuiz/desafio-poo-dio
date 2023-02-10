package br.com.dio.desafio.dominio;

import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        system.out.println(curso1);
    }

}