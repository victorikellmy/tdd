package com.victorikellmy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MatriculaTest {
    @Test
    @DisplayName("deve testar a idade do aluno ")
    void enderecoNull() {
        Estudante estudante = new Estudante("Victor", null, "123joaoreidelas@gmail.com");
        equals("Esta faltando o endereço");
    }

    @Test
    @DisplayName("deve testar a idade do aluno ")
    void nomeNull() {
        Estudante estudante = new Estudante(null, "hbf@gmail.com", "123joaoreidelas@gmail.com");
        equals("Esta faltando o nome");
    }

    @Test
    @DisplayName("deve testar a idade do aluno ")
    void emailNull() {
        Estudante estudante = new Estudante(null, "hbf@gmail.com", "123joaoreidelas@gmail.com");
        equals("Esta faltando o email");
    }
}
