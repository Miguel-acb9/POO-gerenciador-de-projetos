package Entidades;

// Importações de Bibliotecas
import java.util.Date;

public class Tarefa 
{
    // Atributos
    private String id;
    private int status;
    private String nome;
    private String descricao;
    private Date data_de_inicio;
    private Date data_de_terminio;
    
    public Tarefa(
        String id,
        int status,
        String nome,
        String descricao,
        Date data_de_inicio,
        Date data_de_terminio)
    {
        // Construtor
        this.id = id;
        this.status = status;
        this.nome = nome;
        this.descricao = descricao;
        this.data_de_inicio = data_de_inicio;
        this.data_de_terminio = data_de_terminio;
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
    public Date getData_de_inicio()
    {
        return this.data_de_inicio;
    }
    public Date getData_de_terminio()
    {
        return this.data_de_terminio;
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
    public void setData_de_inicio(Date data_de_inicio)
    {
        this.data_de_inicio = data_de_inicio;
    }
    public void setData_de_terminio(Date data_de_terminio)
    {
        this.data_de_terminio = data_de_terminio;
    }

    // Métodos
    public void exibirStatus()
	{
		
	}
    public void exibirResponsaveis()
	{
		
	}
    public void exibirPrazo()
	{
		
	}
    public void editarTarefa()
	{
		
	}
    public void adicionarTarefa()
	{
		
	}
}
