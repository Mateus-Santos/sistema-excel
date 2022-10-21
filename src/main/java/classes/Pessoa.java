package classes;

import java.util.Date;

public abstract class Pessoa {

    protected int id_pessoa;
    protected String nome;
    protected String cpf;
    protected String email;
    protected Date data_nascimento;

    public Pessoa(int id_pessoa, String nome, String cpf, String email, Date data_nascimento) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.data_nascimento = data_nascimento;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
}
