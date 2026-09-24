package org.example;

public class AtendimentoCirurgico implements Atendimento {

    @Override
    public String realizarAtendimento() {
        return "Realizando atendimento cirúrgico";
    }
}