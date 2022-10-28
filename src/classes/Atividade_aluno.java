package classes;

import java.util.Date;

public class Atividade_aluno {
    
    private Aluno aluno;
    private Atividade atividade;
    private Date data_realizada;
    private Float pontuacao;
    private String Anexo;

    public Atividade_aluno(Aluno aluno, Atividade atividade, Date data_realizada, Float pontuacao) {
        this.aluno = aluno;
        this.atividade = atividade;
        this.data_realizada = data_realizada;
        this.pontuacao = pontuacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Date getData_realizada() {
        return data_realizada;
    }

    public void setData_realizada(Date data_realizada) {
        this.data_realizada = data_realizada;
    }

    public Float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Float pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getAnexo() {
        return Anexo;
    }

    public void setAnexo(String Anexo) {
        this.Anexo = Anexo;
    }
    
    
    
    
}
