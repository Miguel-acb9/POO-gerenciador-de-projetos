package Entidades;

public class Usuario {
    // Atributos
    private String id;
    private String nome;
    private boolean administrador;

    public Usuario(String id, String nome, boolean administrador) {
        // Construtor
        this.id = id;
        this.nome = nome;
        this.administrador = administrador;
    }

    // Getters
    public String getID() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public boolean getAdministrador() {
		return this.administrador;
	}

    // Setters
    public void setID(String id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAdministrador() {
		this.administrador = true;
	}

	public void unsetAdministrador() {
		this.administrador = false;
	}
    
}
