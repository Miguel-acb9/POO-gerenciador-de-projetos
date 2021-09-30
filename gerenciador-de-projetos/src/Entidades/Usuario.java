package Entidades;

public class Usuario {
    // Atributos
    private String id;
    private String nome;
    private String email;
    private String senha;
	private String projetos[];
    private boolean administrador;
	

    public Usuario(
		String id, 
		String nome,
		String email,
		String senha,
		String projetos[],
		boolean administrador) 
	{
        // Construtor
        this.id = id;
        this.nome = nome;
		this.email = email;
		this.senha = senha;
        this.administrador = administrador;
		for (int i = 0; i < projetos.length - 1; i++) { this.projetos[i] = projetos[i]; }
    }

    // Métodos Getters
    public String getId() 
	{
		return this.id;
	}
	public String getNome()
	{
		return this.nome;
	}
	public String getEmail() 
	{
		return this.email;
	}
	public String getSenha() 
	{
		return this.senha;
	}
	public String[] getProjetos() 
	{
		return this.projetos;
	}
	public boolean getAdministrador() 
	{
		return this.administrador;
	}

    // Métodos Setters
    public void setId(String id) 
	{
		this.id = id;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public void setSenha(String senha) 
	{
		this.senha = senha;
	}
	public void setProjetos(String[] projetos)
	{
		this.projetos = projetos;
	}
	public void setAdministrador(boolean administrador) 
	{
		this.administrador = administrador;
	}

	// Métodos
	public void cadastrar()
	{
		
	}
	public void verificarLogin()
	{
		
	}
	public void editarCadastro()
	{
		
	}
	public void editarTarefa()
	{
		
	}
	public void adicionarTarefa()
	{
		
	}
	public void adicionarParticipante()
	{
		
	}
	public void removerParticipante()
	{
		
	}
	public void adicionarAdministrador()
	{
		
	}
	public void removerAdministrador()
	{
		
	}
}
