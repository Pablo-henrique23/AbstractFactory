package org.example;

public class FabricaCirurgia implements FabricaAbstrata {

    @Override
    public Atendimento criarAtendimento() {
        return new AtendimentoCirurgico();
    }

    @Override
    public Prontuario criarProntuario() {
        return new ProntuarioCirurgico();
    }
}