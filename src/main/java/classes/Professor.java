package classes;

import java.util.Date;

public class Professor extends Pessoa{
    private int id_professor;
    private Usuario usuario;

    public Professor(int id_professor, Usuario usuario, int id_pessoa, String nome, String cpf, String email, Date data_nascimento) {
        super(id_pessoa, nome, cpf, email, data_nascimento);
        this.id_professor = id_professor;
        this.usuario = usuario;
    }
    
    //Métodos
    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
