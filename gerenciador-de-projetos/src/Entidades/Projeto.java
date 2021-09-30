package Entidades;

// Importações de Bibliotecas
import java.util.Date;

public class Projeto 
{
    // Atributos
    private String id;
	private int status;
	private String nome;
	private String descricao;
	private double orcamento;
	private Date data_de_inicio;
	private Date data_de_termino;
	private String participantes[];
	private String administradores[];
	
	public Projeto(
		String id,
		int status,
		String nome,
		String descricao,
		double orcamento,
		Date data_de_inicio,
		Date data_de_termino,
		String participantes[],
		String administradores[]) 
	{
        // Construtor
		this.id = id;
		this.status = status;
		this.nome = nome;
		this.descricao = descricao;
		this.orcamento = orcamento;
		this.data_de_inicio = data_de_inicio;
		this.data_de_termino = data_de_termino;
		for (int i = 0; i < participantes.length - 1; i++) { this.participantes[i] = participantes[i]; }
		for (int i = 0; i < administradores.length - 1; i++) { this.administradores[i] = administradores[i]; }
	}

    // Métodos Getters
	public String getId() 
	{
		return this.id;
	}
	public int getStatus()
	{
		return this.status;
	}
	public String getNome() 
	{
		return this.nome;
	}
	public String getDescricao()
	{
		return this.descricao;
	}
	public double getOrcamento()
	{
		return this.orcamento;
	}
	public Date getData_de_inicio() 
	{
		return this.data_de_inicio;
	}
	public Date getData_de_termino() 
	{
		return this.data_de_termino;
	}
	public String[] getParticipantes() 
	{
		return this.participantes;
	}
	public String[] getAdministradores() 
	{
		return this.administradores;
	}

    // Métodos Setters
	public void setId(String id) 
	{
		this.id = id;
	}
	public void setStatus(int status)
	{
		this.status = status;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
	public void setOrcamento(double orcamento)
	{
		this.orcamento = orcamento;
	}
	public void setData_de_inicio(Date data_de_inicio) 
	{
		this.data_de_inicio = data_de_inicio;
	}
	public void setData_de_termino(Date data_de_terminio) 
	{
		this.data_de_termino = data_de_terminio;
	}
	public void setParticipantes(String[] participantes) 
	{
		this.participantes = participantes;
	}
	public void setAdministradores(String[] administradores) 
	{
		this.administradores = administradores;
	}

	// Métodos
	public void listarParticipantes(String[] participantes)
	{

	}
	public void editarDados()
	{

	}
	public void exibirStatus()
	{

	}
	public void exibirOrcamento()
	{
		
	}
	public void adicionarParticipantes()
	{
		
	}
	public void removerParticipantes()
	{
		
	}
	public void adicionarAdministradores()
	{
		
	}
	public void removerAdministradores()
	{
		
	}
}
