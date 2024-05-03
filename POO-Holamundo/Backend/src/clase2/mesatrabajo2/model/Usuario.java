package clase2.mesatrabajo2.model;

public class Usuario {
    private String id;
    private tipoDeUsuario tipoUsuario;

    public Usuario(String id, tipoDeUsuario tipoUsuario) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public tipoDeUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(tipoDeUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
