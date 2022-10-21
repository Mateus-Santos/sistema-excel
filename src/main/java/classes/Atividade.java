package classes;

import java.util.Date;

public class Atividade {
    
    private Materia materia;
    private float pontuacao;
    private Date data_vencimento;
    private String anexo;
    
    public Atividade(Materia materia, float pontuacao, Date data_vencimento) {
        this.materia = materia;
        this.pontuacao = pontuacao;
        this.data_vencimento = data_vencimento;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
    
}
