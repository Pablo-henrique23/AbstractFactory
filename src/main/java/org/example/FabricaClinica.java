package org.example;

public class FabricaClinica implements FabricaAbstrata {

    @Override
    public Atendimento criarAtendimento() {
        return new AtendimentoClinico();
    }

    @Override
    public Prontuario criarProntuario() {
        return new ProntuarioClinico();
    }
}
