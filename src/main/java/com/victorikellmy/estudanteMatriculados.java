package com.victorikellmy;

public class estudanteMatriculados extends Estudante {

    public estudanteMatriculados(String nome, String matricula, java.sql.Date dataNasc, String endereco,
            String emailInstitu) {
        super(nome, endereco, emailInstitu);
    }

    @Override
    public void setEmail(String email) {
        // TODO Auto-generated method stub
        super.setEmail(email);
    }

    @Override
    public void setEndereco(String endereco) {
        // TODO Auto-generated method stub
        super.setEndereco(endereco);
    }

    @Override
    public void setMatricula(String matricula) {
        // TODO Auto-generated method stub
        super.setMatricula(matricula);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

}
