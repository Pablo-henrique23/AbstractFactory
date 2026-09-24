package org.example;

public class AtendimentoClinico implements Atendimento {

    @Override
    public String realizarAtendimento() {
        return "Realizando atendimento clínico";
    }
}