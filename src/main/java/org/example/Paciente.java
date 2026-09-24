package org.example;

public class Paciente {

    private Atendimento atendimento;
    private Prontuario prontuario;

    public Paciente(FabricaAbstrata fabrica) {
        this.atendimento = fabrica.criarAtendimento();
        this.prontuario = fabrica.criarProntuario();
    }

    public String realizarAtendimento() {
        return this.atendimento.realizarAtendimento();
    }

    public String registrarProntuario() {
        return this.prontuario.registrarProntuario();
    }
}