package classes;

public class Materia {
    private int id_materia;
    private String nome;

    public Materia(int id_materia, String nome) {
        this.id_materia = id_materia;
        this.nome = nome;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
