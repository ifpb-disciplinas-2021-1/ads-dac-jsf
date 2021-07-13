package br.edu.ifpb.domain;

public class Pessoa {

    private String nome;
    private long id;
    private CPF cpf;
    private Dependente dependente;

    public Pessoa(String nome) {
        this(nome, "11111111111");
    }
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.id = System.nanoTime();
        this.cpf = new CPF(cpf);
    }
    public void alterarNome() {
        this.nome = this.nome.toUpperCase();
    }
    public void alterarNomeMinusculo() {
        this.nome = this.nome.toLowerCase();
    }

    public static Pessoa fake(){
        return new Pessoa("fake");
    }

    public Dependente getDependente() {
        return dependente;
    }
    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
    public CPF getCpf() {
        return cpf;
    }
    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getId() {
        return id;
    }

}
