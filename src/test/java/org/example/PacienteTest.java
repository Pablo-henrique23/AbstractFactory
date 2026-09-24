package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @org.junit.jupiter.api.Test
    void realizarAtendimentoCirugico() {
        FabricaAbstrata fabrica = new FabricaCirurgia();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Realizando atendimento cirúrgico", paciente.realizarAtendimento());
    }

    @org.junit.jupiter.api.Test
    void realizarAtendimentoClinico() {
        FabricaAbstrata fabrica = new FabricaClinica();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Realizando atendimento clínico", paciente.realizarAtendimento());
    }

    @org.junit.jupiter.api.Test
    void registrarProntuarioCirurgico() {
        FabricaAbstrata fabrica = new FabricaCirurgia();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Registrando prontuário cirúrgico", paciente.registrarProntuario());
    }

    @org.junit.jupiter.api.Test
    void registrarProntuarioClinico() {
        FabricaAbstrata fabrica = new FabricaClinica();
        Paciente paciente = new Paciente(fabrica);
        assertEquals("Registrando prontuário clínico", paciente.registrarProntuario());
    }
}