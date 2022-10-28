package classes;


public class Usuario {
    private int id_usuario;
    private String usuario;
    private String senha;

    public Usuario(int id_usuario, String usuario, String senha) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getId_usuario() {
        return id_usuario;
    }
    
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
