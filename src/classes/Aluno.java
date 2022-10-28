package classes;

public class Aluno {
    private int aluno;
    private Usuario usuario;

    public Aluno(int aluno, Usuario usuario) {
        this.aluno = aluno;
        this.usuario = usuario;
    }

    public int getAluno() {
        return aluno;
    }

    public void setAluno(int aluno) {
        this.aluno = aluno;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
