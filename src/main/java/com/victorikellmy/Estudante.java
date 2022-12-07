package com.victorikellmy;

public class Estudante {
    private String nome;
    private String matricula;
    // private Date dataNascimento;
    private String endereco;
    private String email;

    public Estudante(String nome, String endereco, String email) {
        this.nome = nome;
        // this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmailInstitu() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String Matricula() {
        String matricula = "90466316";
        String digito = "1";

        // retorna desde o primeiro digito até o sexto;
        String prefixoString = matricula.substring(0, 6);

        // retorna o último digito independente do tamanho da string
        String sufixoString = matricula.substring(matricula.length() - 1);

        // convertemos prefixo de string para int para poder incrementá-lo
        // caso sufixoString seja igual a "X"
        int prefixoInt = Integer.parseInt(prefixoString);

        if (sufixoString.equals("9")) {
            sufixoString = "X";
        } else if (sufixoString.equals("X")) {
            sufixoString = "0";
            prefixoInt += 1;
        } else {
            // convertemos sufixoString para int para poder somá-lo com um
            // e após a soma o transformamos de novo em string
            int sufixoInt = Integer.parseInt(sufixoString);
            sufixoString = String.valueOf(sufixoInt + 1);
        }

        String novaMatricula = prefixoInt + digito + sufixoString;
        return novaMatricula;

    }

    public void validar() {
        if (nome == null) {
            System.out.println("Esta faltando o nome");

        } else if (endereco == null) {
            System.out.println("Esta faltando o endereço");
        } else if (email == null) {
            System.out.println("Esta faltando o email");
        }
    }

}
